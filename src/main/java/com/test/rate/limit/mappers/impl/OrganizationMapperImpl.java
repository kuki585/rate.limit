package com.test.rate.limit.mappers.impl;

/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
import org.springframework.stereotype.Component;

import com.test.rate.limit.dtos.OrganizationDTO;
import com.test.rate.limit.entities.Organization;
import com.test.rate.limit.mappers.OrganizationMapper;

/**
 * This class is used to map Organization Entity to Organization DTO.
 * @author Ankur Jain
 *
 */
@Component
public class OrganizationMapperImpl implements OrganizationMapper{

	@Override
	public Organization mapToEntity(OrganizationDTO organizationDTO) {
		Organization organization = new Organization();
		organization.setCity(organizationDTO.getCity());
		organization.setCreatedBy(organizationDTO.getCreatedBy());
		organization.setCreationDttm(organizationDTO.getCreationDttm());
		organization.setModifiedBy(organizationDTO.getModifiedBy());
		organization.setModifiedDttm(organizationDTO.getModifiedDttm());
		organization.setOrganizationId(organizationDTO.getOrganizationId());
		organization.setOrganizationName(organizationDTO.getOrganizationName());
		organization.setVersion(organizationDTO.getVersion());
		return organization;
	}

}
