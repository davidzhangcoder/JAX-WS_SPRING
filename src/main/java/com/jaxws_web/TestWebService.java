package com.jaxws_web;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**  
 * ProjectName:	jax-ws_web 
 * Filename:	TestWebService.java  
 * Description:   
 * Copyright:   	Copyright (c)2010 
 * Company:    	company 
 * @author:    	david
 * @version:    	1.0  
 * Create at:   	Aug 31, 2013 5:43:00 PM  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * Aug 31, 2013    david      1.0        1.0 Version  
 */

@WebService(name = "TestWebService", targetNamespace = "http://jaxws_web.com/")
@SOAPBinding(style=Style.DOCUMENT)
public interface TestWebService
{
	public String webServiceMethod1();
	
	public User updateUser(User user);
	
	@WebMethod
	public  @WebResult(name="user_response") WMSMD_Message_Response LoginUserInfo(  @WebParam(name="request")  WMSMD_User_Request request );

	
	
	@WebMethod
	public  @WebResult(name="sku_response") String queryStringInfo(@WebParam(name="sku") String sku);

	
}



