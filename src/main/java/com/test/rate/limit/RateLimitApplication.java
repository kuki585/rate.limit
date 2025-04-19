/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class acts as the starting point for Rate Limit Application.
 * @author Ankur Jain
 *
 */
@SpringBootApplication
public class RateLimitApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateLimitApplication.class, args);
	}

}
