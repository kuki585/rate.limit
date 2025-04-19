/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.dtos;

import java.sql.Date;

/**
 * This class is used to transfer the data for User entity object.
 * @author Ankur Jain
 *
 */
public class UserDTO {

	private String userId;
	
	private String api;
	
	private int rateCount;
	
	private int rateLimit;
	
	private String createdBy;
	
	private Date  creationDttm;
	
	private String modifiedBy;
	
	private Date  modifiedDttm;
	
	private int version;

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

	public int getRateCount() {
		return rateCount;
	}

	public void setRateCount(int rateCount) {
		this.rateCount = rateCount;
	}

	public int getRateLimit() {
		return rateLimit;
	}

	public void setRateLimit(int rateLimit) {
		this.rateLimit = rateLimit;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDttm() {
		return creationDttm;
	}

	public void setCreationDttm(Date creationDttm) {
		this.creationDttm = creationDttm;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDttm() {
		return modifiedDttm;
	}

	public void setModifiedDttm(Date modifiedDttm) {
		this.modifiedDttm = modifiedDttm;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}

