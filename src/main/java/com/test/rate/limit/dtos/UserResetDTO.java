/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.dtos;

/**
 * This class is used to transfer the data for User entity object.
 * @author Ankur Jain
 *
 */
public class UserResetDTO {

	private String userId;
	
	private String api;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

}

