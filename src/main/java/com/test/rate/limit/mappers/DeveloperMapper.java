/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.mappers;

import com.test.rate.limit.dtos.DeveloperDTO;
import com.test.rate.limit.entities.Developer;

/**
 * This interface acts as template to map DTO to Entity for Developers.
 * @author Ankur Jain
 *
 */
public interface DeveloperMapper {

	Developer mapToEntity(DeveloperDTO developerDTO);
}
