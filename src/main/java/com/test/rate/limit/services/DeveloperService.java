/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.services;

import com.test.rate.limit.dtos.DeveloperDTO;
import com.test.rate.limit.exception.RateLimitException;

/**
 * This interface acts as the template to provide business logic for the 
 * addition of Developers to the database.
 * @author Ankur Jain
 *
 */
public interface DeveloperService {

	void addDeveloper(DeveloperDTO developerDTO)  throws RateLimitException ;
}
