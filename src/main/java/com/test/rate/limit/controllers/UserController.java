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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rate.limit.Constants.RateLimtConstant;
import com.test.rate.limit.dtos.FailureResponseDTO;
import com.test.rate.limit.dtos.UserDTO;
import com.test.rate.limit.dtos.UserResetDTO;
import com.test.rate.limit.services.UserService;

/**
 * This class orchestrates all the rest api exposed for user entity.
 * 
 * @author Ankur Jain
 *
 */
@RestController
@RequestMapping("/api/v1/")
public class UserController {

	@Autowired
	private UserService userService;

	@PutMapping("users")
	public ResponseEntity<?> addDeveloper(@RequestBody UserResetDTO userResetDTO) {

		ResponseEntity<?> responsEntity = null;

		try {
			UserDTO userDTO = userService.resetUser(userResetDTO);
			responsEntity = new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
		} catch (Exception exception) {
			exception.printStackTrace();
			FailureResponseDTO failureResponseDTO = new FailureResponseDTO();
			failureResponseDTO.setErrorDate(new java.sql.Date(System.currentTimeMillis()));
			failureResponseDTO.setMessage(exception.getMessage());
			failureResponseDTO.setMessageCategory(RateLimtConstant.MSG_CAT_1);
			failureResponseDTO.setMessageCode(RateLimtConstant.MSG_CODE_3);
			failureResponseDTO.setStatus(RateLimtConstant.FAILED);
			responsEntity = new ResponseEntity<FailureResponseDTO>(failureResponseDTO, HttpStatus.BAD_REQUEST);
		}

		return responsEntity;

	}

}
