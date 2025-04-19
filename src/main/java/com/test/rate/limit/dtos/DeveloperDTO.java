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
 * This class is used to transfer the data for Developer entity object.
 * @author Ankur Jain
 *
 */
public class DeveloperDTO {

	private Integer developerId;
	
	private String developerName;
	
	private String userId;
	
	private int age;
	
	private String skill;
	
	private int salary;
	
	private String city;
	
	private OrganizationDTO organization;
	
	private String createdBy;
	
	private Date  creationDttm;
	
	private String modifiedBy;
	
	private Date  modifiedDttm;
	
	private int version;

	public Integer getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(Integer developerId) {
		this.developerId = developerId;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public OrganizationDTO getOrganizationDTO() {
		return organization;
	}

	public void setOrganizationDTO(OrganizationDTO organization) {
		this.organization = organization;
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
