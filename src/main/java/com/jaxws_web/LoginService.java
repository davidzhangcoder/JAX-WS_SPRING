package com.jaxws_web;

import javax.jws.WebService;

/**  test
 * ProjectName:	jax-ws_web 1
 * Filename:	LoginService.java  
 * Description:   
 * Copyright:   	Copyright (c)2010 
 * Company:    	company 
 * @author:    	david
 * @version:    	1.0  
 * Create at:   	Dec 30, 2013 2:01:46 AM  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * Dec 30, 2013    david      1.0        1.0 Version  
 */

@WebService(name = "LoginService", targetNamespace = "http://jaxws_web1.com/")
public interface LoginService
{
	//1
	public String testlogin();

}
