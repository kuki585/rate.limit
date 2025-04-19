/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.services;

import com.test.rate.limit.dtos.UserDTO;
import com.test.rate.limit.dtos.UserResetDTO;
import com.test.rate.limit.entities.Id.UserId;
import com.test.rate.limit.exception.RateLimitException;

/**
 * This interface acts as the template to provide business logic to 
 * fetch of User from the database and persist the User to database.
 * @author Ankur Jain
 *
 */
public interface UserService {

	UserDTO fetchUser(UserId userId)  throws RateLimitException ;
	
	void addUser(UserDTO userDTO);
	
	void validateAndPersistRateLimt(UserId userId) throws RateLimitException;
	
	UserDTO resetUser(UserResetDTO userResetDTO)  throws RateLimitException ;
	
}
