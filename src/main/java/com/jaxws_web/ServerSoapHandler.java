package com.jaxws_web;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**  
 * ProjectName:	jax-ws_web 
 * Filename:	ServerSoapHandler.java  
 * Description:   
 * Copyright:   	Copyright (c)2010 
 * Company:    	company 
 * @author:    	david
 * @version:    	1.0  
 * Create at:   	Dec 30, 2013 1:58:52 AM  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * Dec 30, 2013    david      1.0        1.0 Version  
 */

public class ServerSoapHandler implements SOAPHandler<SOAPMessageContext> 
{

	/**
	 * @param context
	 * @return
	 */
	@Override
	public boolean handleMessage(SOAPMessageContext context)
	{
//		System.out.println("run ServerSoapHandler - handleMessage");
//		// 获得当前调用方向
//		Boolean out = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
//		
//		if (!out)
//		{
//			// 响应
//			java.util.Map<String, List<String>> responseHeaders = 
//				(Map<String, List<String>>) context.get(MessageContext.HTTP_REQUEST_HEADERS);
//			List<String> c = responseHeaders.get("cookie"); 
//			if ( c == null || c.size() <0  )
//			{ 
//				return false;
//			}
//		}
//		else
//		{
//			java.util.Map<String, List<String>> requestHeaders = 
//				(Map<String, List<String>>) context.get(MessageContext.HTTP_REQUEST_HEADERS);
//
//		}
		
		return true;
	}

	/**
	 * @param context
	 * @return
	 */
	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("run ServerSoapHandler - handleFault");
		return false;
	}

	/**
	 * @param context
	 */
	@Override
	public void close(MessageContext context) {
		
	}

	/**
	 * @return
	 */
	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
