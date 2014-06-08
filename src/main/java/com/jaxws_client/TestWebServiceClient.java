package com.jaxws_client;

import javax.xml.ws.BindingProvider;

import com.jaxws_client.generated.TestWebServiceImpl;
import com.jaxws_client.generated.TestWebServiceImplService;
import com.jaxws_client.generated.User;

/**  
 * ProjectName:	jax-ws_web 
 * Filename:	TestWebServiceClient.java  
 * Description:   
 * Copyright:   	Copyright (c)2010 
 * Company:    	company 
 * @author:    	david
 * @version:    	1.0  
 * Create at:   	Sep 1, 2013 8:44:58 PM  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * Sep 1, 2013    david      1.0        1.0 Version  
 */

public class TestWebServiceClient
{
	public static void main(String[] args)
	{
		//åœ¨å�Œä¸€ä¸ªServiceçš„ä¸�å�Œè°ƒç”¨ä¹‹é—´ä¿�æŒ�ä¼šè¯�
		//test-commit-1
		TestWebServiceImpl service = new TestWebServiceImplService().getTestWebServiceImplPort();
		
		((BindingProvider)service).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);

		//Test
		System.out.println( service.webServiceMethod1() );
//		System.out.println( service.webServiceMethod1() );
//		System.out.println( service.webServiceMethod1() );
//		System.out.println( service.webServiceMethod1() );
//		System.out.println( service.webServiceMethod1() );
		
		//Test1
		User user = new User();
		user.setName( "Name1" );
		System.out.println( service.updateUser(user).getName() );
		
	}
}
