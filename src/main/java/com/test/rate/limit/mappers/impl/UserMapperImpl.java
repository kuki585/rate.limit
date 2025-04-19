/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.mappers.impl;

import org.springframework.stereotype.Component;

import com.test.rate.limit.dtos.UserDTO;
import com.test.rate.limit.entities.User;
import com.test.rate.limit.entities.Id.UserId;
import com.test.rate.limit.mappers.UserMapper;

/**
 * This class is used to map User Entity to or from User DTO.
 * @author Ankur Jain
 *
 */
@Component
public class UserMapperImpl implements UserMapper {

	@Override
	public User mapToEntity(UserDTO userDTO) {
		User user = new User();
		UserId userId = new UserId();
		userId.setApi(userDTO.getApi());
		userId.setUserId(userDTO.getUserId());
		user.setUserId(userId);
		user.setCreatedBy(userDTO.getCreatedBy());
		user.setCreationDttm(userDTO.getCreationDttm());
		user.setModifiedBy(userDTO.getModifiedBy());
		user.setModifiedDttm(userDTO.getModifiedDttm());
		user.setRateCount(userDTO.getRateCount());
		user.setRateLimit(userDTO.getRateLimit());
		
		user.setVersion(userDTO.getVersion());
		return user;
	}

	@Override
	public UserDTO mapToDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setApi(user.getUserId().getApi());
		userDTO.setCreatedBy(user.getCreatedBy());
		userDTO.setCreationDttm(user.getCreationDttm());
		userDTO.setModifiedBy(user.getModifiedBy());
		userDTO.setModifiedDttm(user.getModifiedDttm());
		userDTO.setRateCount(user.getRateCount());
		userDTO.setRateLimit(user.getRateLimit());
		userDTO.setUserId(user.getUserId().getUserId());
		userDTO.setVersion(user.getVersion());
		return userDTO;
	}

}
