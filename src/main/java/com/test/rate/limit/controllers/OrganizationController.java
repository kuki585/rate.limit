/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rate.limit.Constants.RateLimtConstant;
import com.test.rate.limit.dtos.FailureResponseDTO;
import com.test.rate.limit.dtos.OrganizationDTO;
import com.test.rate.limit.services.OrganizationService;

/**
 * This class orchestrates all the rest api exposed for organization entity.
 * @author Ankur Jain
 *
 */
@RestController
@RequestMapping("/api/v1/")
public class OrganizationController {
	
	@Autowired
	private OrganizationService organizationService;

	@PostMapping("organizations")
	public ResponseEntity<?> addOrganization(@RequestBody OrganizationDTO organizationDTO) {

		ResponseEntity<?> responsEntity = null;

		try {
			organizationService.addOrganization(organizationDTO);
			responsEntity = new ResponseEntity<OrganizationDTO>(organizationDTO, HttpStatus.OK);
		} catch (Exception exception) {
			exception.printStackTrace();
			FailureResponseDTO failureResponseDTO = new FailureResponseDTO();
			failureResponseDTO.setErrorDate(new java.sql.Date(System.currentTimeMillis()));
			failureResponseDTO.setMessage(exception.getMessage());
			failureResponseDTO.setMessageCategory(RateLimtConstant.MSG_CAT_1);
			failureResponseDTO.setMessageCode(RateLimtConstant.MSG_CODE_2);
			failureResponseDTO.setStatus(RateLimtConstant.FAILED);
			responsEntity = new ResponseEntity<FailureResponseDTO>(failureResponseDTO, HttpStatus.BAD_REQUEST);
		}

		return responsEntity;

	}

}
