/***********************************************
 * @Copyright Ankur Jain
 * 
 *  Date    		Author      Comments
 *  01-Aug-2021     Ankur Jain  Initial Draft
 *  
 ***********************************************/
package com.test.rate.limit.Constants;

/**
 * This class stores the constants used in the Rate Limit Application.
 * @author Ankur Jain
 *
 */
public class RateLimtConstant {

	private RateLimtConstant() {
		
	}
	
	public static String FAILED = "FAILED";
	public static int MSG_CAT_1 = 1;
	public static int MSG_CODE_1 = 1;
	public static int MSG_CODE_2 = 2;
	public static int MSG_CODE_3 = 3;
	
	/** Messages */
	public static String INV_USR_ID = "Invalid User Id ";
	public static String EMPTY_USR_ID = "Empty User Id";
	public static String RATE_LIMIT_EXD = "Rate Limit Exceeded, Current Limit ";
	
	/** APIs*/
	public static String DEVELOPER_API = "/api/v1/developers";
	public static String ORGANIZATION_API = "/api/v1/organizations";
}
