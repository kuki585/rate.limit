/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rate.limit.Constants.RateLimtConstant;
import com.test.rate.limit.dtos.DeveloperDTO;
import com.test.rate.limit.entities.Developer;
import com.test.rate.limit.entities.Id.UserId;
import com.test.rate.limit.exception.RateLimitException;
import com.test.rate.limit.mappers.DeveloperMapper;
import com.test.rate.limit.repositories.DeveloperRepository;
import com.test.rate.limit.services.DeveloperService;
import com.test.rate.limit.services.UserService;

/**
 * This class implements the business logic to add Developers to the database.
 * @author Ankur Jain
 *
 */
@Service
public class DeveloperServiceImpl implements DeveloperService{

	@Autowired
	private UserService userService;
	
	@Autowired
	private DeveloperRepository developerRepository;
	
	@Autowired
	private DeveloperMapper developerMapper;
	
	@Override
	public void addDeveloper(DeveloperDTO developerDTO) throws RateLimitException {

		UserId userId = new UserId();
		userId.setApi(RateLimtConstant.DEVELOPER_API);
		userId.setUserId(developerDTO.getUserId());
		
		userService.validateAndPersistRateLimt(userId);
		
		Developer developer = developerMapper.mapToEntity(developerDTO); 
		developerRepository.save(developer);
		
	}

}
