package com.jaxws_web;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**  
 * ProjectName:	jax-ws_web 
 * Filename:	LoginServiceImpl.java  
 * Description:   
 * Copyright:   	Copyright (c)2010 
 * Company:    	company 
 * @author:    	david
 * @version:    	1.0  
 * Create at:   	Dec 30, 2013 2:02:05 AM  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * Dec 30, 2013    david      1.0        1.0 Version  
 */

@WebService(targetNamespace = "http://jaxws_web1.com/",
		portName = "LoginServiceImplPort",
		serviceName = "LoginServiceImplService")
public class LoginServiceImpl implements LoginService
{
	
	public static final String KEY = "key";
	
	@Resource
	WebServiceContext wsContext;

	
	@WebResult(name = "return1")
	@WebMethod(operationName = "testlogin", action = "urn:testlogin")
	public String testlogin() 
	{
		MessageContext mc = wsContext.getMessageContext();
		
		HttpSession session = ((HttpServletRequest)mc.get(MessageContext.SERVLET_REQUEST)).getSession();
		Long count = 0L;
		if( session.getAttribute(KEY) == null )
			session.setAttribute(KEY, count);
		
		session.setAttribute(KEY, (Long)session.getAttribute(KEY)+1 );
		
		System.out.println( (Long)session.getAttribute(KEY) );

		
//		return "login" + (Long)session.getAttribute(KEY)+"-"+session.getId();
		return "1";
	}

}
