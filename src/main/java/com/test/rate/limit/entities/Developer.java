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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class represents the Java equivalence of developer table in the database. 
 * @author Ankur Jain
 *
 */
@Entity
@Table(name="developer")
public class Developer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="developer_id")
	private Integer developerId;
	
	@Column(name="developer_name")
	private String developerName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="skill")
	private String skill;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="city")
	private String city;
	
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
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer )) return false;
        return developerId != null && developerId.equals(((Developer) o).getDeveloperId());
    }
 
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
	
}
