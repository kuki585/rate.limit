/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.dtos;

import java.sql.Date;
import java.util.List;

/**
 * This class is used to transfer the data for Organization entity object.
 * @author Ankur Jain
 *
 */
public class OrganizationDTO {

	private Integer organizationId;

	private String organizationName;
	
	private String userId;
	
	private String city;
	
	private List<DeveloperDTO> developers;
	
	private String createdBy;
	
	private Date  creationDttm;
	
	private String modifiedBy;
	
	private Date  modifiedDttm;
	
	private int version;

	public Integer getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<DeveloperDTO> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<DeveloperDTO> developers) {
		this.developers = developers;
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

	public void addDeveloper(DeveloperDTO developer) {
		developers.add(developer);
		developer.setOrganizationDTO(this);
	}

	public void removeDeveloper(DeveloperDTO developer) {
		developers.remove(developer);
		developer.setOrganizationDTO(null);
	}
	
}
