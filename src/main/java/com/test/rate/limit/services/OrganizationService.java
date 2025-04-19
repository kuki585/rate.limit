/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.services;

import com.test.rate.limit.dtos.OrganizationDTO;
import com.test.rate.limit.exception.RateLimitException;

/**
 * This interface acts as the template to provide business logic for the 
 * addition of Organizations to the database.
 * @author Ankur Jain
 *
 */
public interface OrganizationService {

	void addOrganization(OrganizationDTO organizationDTO)  throws RateLimitException;
}
