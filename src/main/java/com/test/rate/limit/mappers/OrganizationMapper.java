/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.mappers;

import com.test.rate.limit.dtos.OrganizationDTO;
import com.test.rate.limit.entities.Organization;

/**
 * This interface acts as template to map DTO to Entity for Organizations.
 * @author Ankur Jain
 *
 */
public interface OrganizationMapper {

	Organization mapToEntity(OrganizationDTO organizationDTO);
}
