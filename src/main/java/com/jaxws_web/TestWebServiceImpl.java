package com.jaxws_web;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 * ProjectName: jax-ws_web Filename: TestWebServiceImpl.java Description:
 * Copyright: Copyright (c)2010 Company: company
 * 
 * @author: david
 * @version: 1.0 Create at: Aug 31, 2013 5:43:39 PM
 * 
 *           Modification History: Date Author Version Description
 *           ------------------------------------------------------------------
 *           Aug 31, 2013 david 1.0 1.0 Version
 */

@WebService(targetNamespace = "http://jaxws_web.com/", portName = "TestWebServiceImplPort", serviceName = "TestWebServiceImplService")
public class TestWebServiceImpl implements TestWebService {
	// visit by http://localhost:8081/jax-ws_web/test
	// @HandlerChain(file="service-handler-chain.xml")

	public static final String KEY = "key";

	@Resource
	WebServiceContext wsContext;

	@WebResult(name = "return")
	@WebMethod(operationName = "webServiceMethod1", action = "urn:WebServiceMethod1")
	public String webServiceMethod1() {
		MessageContext mc = wsContext.getMessageContext();

		HttpSession session = ((HttpServletRequest) mc
				.get(MessageContext.SERVLET_REQUEST)).getSession();
		Long count = 0L;
		if (session.getAttribute(KEY) == null)
			session.setAttribute(KEY, count);

		session.setAttribute(KEY, (Long) session.getAttribute(KEY) + 1);

		System.out.println((Long) session.getAttribute(KEY));

		return "hello world" + (Long) session.getAttribute(KEY) + "-"
				+ session.getId();

		// return "1";
	}

	@Override
	public User updateUser(User user) {
		user.setName("Updated : " + user.getName());

		return user;
	}

	@Override
	@WebMethod
	public WMSMD_Message_Response LoginUserInfo(
			@WebParam(name = "request") WMSMD_User_Request request) {
		WMSMD_Message_Response wMSMD_Message_Response = new WMSMD_Message_Response();
		wMSMD_Message_Response.setSuccess(true);
		wMSMD_Message_Response.setMessage("success message");
		wMSMD_Message_Response.setResult("aaaaa");
		
		System.out.print( myBObject.printMessage() );
		
		return wMSMD_Message_Response;
	}

	// Dependency Injection (DI) via Spring
	MyBObject myBObject;

	@WebMethod(exclude = true)
	public void setMyBObject(MyBObject bObject) {
		this.myBObject = bObject;
	}

	@Override
	public String queryStringInfo(String sku) {
		// TODO Auto-generated method stub
		return null;
	}

}
