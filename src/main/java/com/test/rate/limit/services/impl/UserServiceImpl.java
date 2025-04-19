/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rate.limit.Constants.RateLimtConstant;
import com.test.rate.limit.dtos.UserDTO;
import com.test.rate.limit.dtos.UserResetDTO;
import com.test.rate.limit.entities.User;
import com.test.rate.limit.entities.Id.UserId;
import com.test.rate.limit.exception.RateLimitException;
import com.test.rate.limit.mappers.UserMapper;
import com.test.rate.limit.repositories.UserRepository;
import com.test.rate.limit.services.UserService;

/**
 * This class implements the business logic to fetch User and 
 * Persist User from or to the database.
 * @author Ankur Jain
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDTO fetchUser(UserId userId) throws RateLimitException {

		if(userId ==  null) {
			throw new RateLimitException(RateLimtConstant.EMPTY_USR_ID);
		}
		Optional<User> userOptional = userRepository.findById(userId);
		
		if(userOptional.isPresent()) {
			User user = userOptional.get();
			UserDTO userDTO = userMapper.mapToDTO(user);
			return userDTO;
		}else {
			throw new RateLimitException(RateLimtConstant.INV_USR_ID + userId.getUserId()+":"+userId.getApi());
		}
		
	}

	@Override
	public void addUser(UserDTO userDTO) {
		User user= userMapper.mapToEntity(userDTO);
		userRepository.save(user);
		
	}
	
	@Override
	public void validateAndPersistRateLimt(UserId userId) throws RateLimitException {
		UserDTO userDTO = fetchUser(userId);
		
		int ratecount = userDTO.getRateCount();
		int rateLimit = userDTO.getRateLimit();
		
		if(ratecount+1 > rateLimit) {
			throw new RateLimitException(RateLimtConstant.RATE_LIMIT_EXD + (ratecount+1));
		}
		
		userDTO.setRateCount(ratecount+1);
		addUser(userDTO);
	}
	
	@Override
	public UserDTO resetUser(UserResetDTO userResetDTO) throws RateLimitException {
		UserId userId = new UserId();
		userId.setApi(userResetDTO.getApi());
		userId.setUserId(userResetDTO.getUserId());
		UserDTO userDTO = fetchUser(userId);
		userDTO.setRateCount(0);
		addUser(userDTO);
		return userDTO;
	}

}
