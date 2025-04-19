/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.mappers;

import com.test.rate.limit.dtos.UserDTO;
import com.test.rate.limit.entities.User;

/**
 * This interface acts as template to map DTO to and From Entity for Developers.
 * @author Ankur Jain
 *
 */
public interface UserMapper {

	User mapToEntity(UserDTO userDTO);
	
	UserDTO mapToDTO(User user);
}
