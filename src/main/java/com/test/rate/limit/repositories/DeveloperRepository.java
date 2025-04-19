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

import com.test.rate.limit.entities.Developer;

/**
 * This interface acts as the repository layer to access Developer Table.
 * @author Ankur Jain
 *
 */
@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer> {

}
