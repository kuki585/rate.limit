/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.test.rate.limit.entities.Id.UserId;

/**
 * This class represents the Java equivalence of user table in the database. 
 * @author Ankur Jain
 *
 */
@Entity
@Table(name="users")
public class User {

	@EmbeddedId
	private UserId userId;
	
	@Column(name="rate_count")
	private int rateCount;
	
	@Column(name="rate_limit")
	private int rateLimit;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="creation_dttm")
	private Date  creationDttm;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="modified_dttm")
	private Date  modifiedDttm;
	
	@Column(name="version")
	private int version;

	public UserId getUserId() {
		return userId;
	}

	public void setUserId(UserId userId) {
		this.userId = userId;
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

