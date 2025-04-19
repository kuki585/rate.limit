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
 * This class is used to transfer the data for failure responses.
 * @author Ankur Jain
 *
 */
public class FailureResponseDTO {
	
	private int messageCategory;
	
	private int messageCode;
	
	private String message;
	
	private String status;

	private Date errorDate;

	public int getMessageCategory() {
		return messageCategory;
	}

	public void setMessageCategory(int messageCategory) {
		this.messageCategory = messageCategory;
	}

	public int getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getErrorDate() {
		return errorDate;
	}

	public void setErrorDate(Date errorDate) {
		this.errorDate = errorDate;
	}
	
	
}
