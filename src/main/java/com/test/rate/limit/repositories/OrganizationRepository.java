/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.rate.limit.entities.Organization;

/**
 * This interface acts as the repository layer to access Organization Table.
 * @author Ankur Jain
 *
 */
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer>{

}
