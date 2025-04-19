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
import com.test.rate.limit.dtos.OrganizationDTO;
import com.test.rate.limit.entities.Organization;
import com.test.rate.limit.entities.Id.UserId;
import com.test.rate.limit.exception.RateLimitException;
import com.test.rate.limit.mappers.OrganizationMapper;
import com.test.rate.limit.repositories.OrganizationRepository;
import com.test.rate.limit.services.OrganizationService;
import com.test.rate.limit.services.UserService;

/**
 * This class implements the business logic to add Organizations to the database.
 * @author Ankur Jain
 *
 */
@Service
public class OrganizationServiceImpl implements OrganizationService{

	@Autowired
	private UserService userService;
	
	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Autowired
	private OrganizationMapper organizationMapper;
	
	@Override
	public void addOrganization(OrganizationDTO organizationDTO) throws RateLimitException  {

		UserId userId = new UserId();
		userId.setApi(RateLimtConstant.ORGANIZATION_API);
		userId.setUserId(organizationDTO.getUserId());
				
		userService.validateAndPersistRateLimt(userId);
		
		Organization organization = organizationMapper.mapToEntity(organizationDTO); 
		organizationRepository.save(organization);
		
	}
	
}
