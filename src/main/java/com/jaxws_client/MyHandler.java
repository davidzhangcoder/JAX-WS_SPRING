package com.jaxws_client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 * ProjectName: jax-ws_web Filename: MyHandler.java Description: Copyright:
 * Copyright (c)2010 Company: company
 * 
 * @author: david
 * @version: 1.0 Create at: Sep 22, 2013 10:14:32 AM
 * 
 *           Modification History: Date Author Version Description
 *           ------------------------------------------------------------------
 *           Sep 22, 2013 david 1.0 1.0 Version
 */

public class MyHandler implements SOAPHandler<SOAPMessageContext> {

	private static List cookie = null;  

	
	/**
	 * @return
	 */
	@Override
	public Set<QName> getHeaders() {
		return null;
	}

	/**
	 * @param context
	 */
	@Override
	public void close(MessageContext context) {

	}

	/**
	 * @param context
	 * @return
	 */
	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("run MyHandler - handleFault");
		return false;
	}

	/**
	 * @param context
	 * @return
	 */
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("run MyHandler - handleMessage");
		try {
			// 获得当前调用方向
			Boolean out = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			if (!out) {// 响应
//				Map<String, List<String>> responseHeaders = (Map<String, List<String>>) context.get(MessageContext.HTTP_RESPONSE_HEADERS);
//				List<String> c = responseHeaders.get("Set-cookie"); // sessionid在该域中
//				if (cookie == null && c != null) { // 这是第一次HTTP调用，cookie刚刚得到
//					cookie = c; // 保存该cookie
//				} else {
//					System.out.println("DEBUG: 现在不是第一个调用HTTP了.因此COOKIE早已存在.");
//				}
			} else { // 请求
//				// 获取请求上下文
//				java.util.Map<String, List<String>> requestHeaders = 
//					(Map<String, List<String>>) context.get(MessageContext.HTTP_REQUEST_HEADERS);
//				if (requestHeaders == null)
//				{ // 请求上下文可能为空，构造一个新的即可
//					requestHeaders = new HashMap<String, List<String>>();
//					// 将一个空的请求上下文设置到SOAPMessageContext中
//					context.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
//					// 设置该请求上下文全局有效
//					context.setScope(MessageContext.HTTP_REQUEST_HEADERS, MessageContext.Scope.APPLICATION);
//				}
//				// 如果已经获得了sessionid，将该sessionid设置到请求上下文中即可
//				if (cookie != null) {
//					requestHeaders.put("cookie", cookie);
//				}
			
			
			//JSESSIONID=A7A9F53FE3B3BF95943F548005EF85A4; Path=/jax-ws_web
			java.util.Map<String, List<String>> requestHeaders = 
				(Map<String, List<String>>) context.get(MessageContext.HTTP_REQUEST_HEADERS);
			if (requestHeaders == null)
			{
				requestHeaders = new HashMap<String, List<String>>();
				// 将一个空的请求上下文设置到SOAPMessageContext中
				context.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
				// 设置该请求上下文全局有效
				context.setScope(MessageContext.HTTP_REQUEST_HEADERS, MessageContext.Scope.APPLICATION);

				List<String> cookieList = new ArrayList<String>();
				cookieList.add( new String("JSESSIONID=7F381C75345E0D3154EE21F6BD0BB06C; Path=/jax-ws_web") );
				requestHeaders.put("cookie", cookieList);
			}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;// 返回true，意味着其它Handler也可以被调用
	}

}
