/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.mappers.impl;

import org.springframework.stereotype.Component;

import com.test.rate.limit.dtos.DeveloperDTO;
import com.test.rate.limit.entities.Developer;
import com.test.rate.limit.mappers.DeveloperMapper;

/**
 * This class is used to map Developer Entity to Developer DTO.
 * @author Ankur Jain
 *
 */
@Component
public class DeveloperMapperImpl implements DeveloperMapper {

	@Override
	public Developer mapToEntity(DeveloperDTO developerDTO) {
		Developer developer = new Developer();
		developer.setAge(developerDTO.getAge());
		developer.setCity(developerDTO.getCity());
		developer.setCreatedBy(developerDTO.getCreatedBy());
		developer.setCreationDttm(developerDTO.getCreationDttm());
		developer.setDeveloperId(developerDTO.getDeveloperId());
		developer.setDeveloperName(developerDTO.getDeveloperName());
		developer.setModifiedBy(developerDTO.getModifiedBy());
		developer.setModifiedDttm(developerDTO.getModifiedDttm());
		developer.setSalary(developerDTO.getSalary());
		developer.setSkill(developerDTO.getSkill());
		developer.setVersion(developerDTO.getVersion());
		
		return developer;
	}

}
