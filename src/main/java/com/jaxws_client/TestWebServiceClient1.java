package com.jaxws_client;

import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import com.jaxws_client.generated.TestWebServiceImpl;
import com.jaxws_client.generated.TestWebServiceImplService;

/**  
 * ProjectName:	jax-ws_web 
 * Filename:	TestWebServiceClient1.java  
 * Description:   
 * Copyright:   	Copyright (c)2010 
 * Company:    	company 
 * @author:    	david
 * @version:    	1.0  
 * Create at:   	Sep 22, 2013 10:13:43 AM  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * Sep 22, 2013    david      1.0        1.0 Version  
 */

public class TestWebServiceClient1
{
	public static final MyHandler handler = new MyHandler();  

	public static void main(String[] args)
	{
		//在多个SERVICE中保持会话
		TestWebServiceImpl service = new TestWebServiceImplService().getTestWebServiceImplPort();
		
		//((BindingProvider)service).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
		
        //调用到了我们之前声明的HANDLER了哦。实现多个SERVICE间的会话保持。   
        Binding binding  = ((BindingProvider) service).getBinding();  
        List<Handler> handlerList = binding.getHandlerChain();//获得Handler链   
        if (!handlerList.contains(handler))
        {//防止重复插入Handler   
            handlerList.add(handler);  
            binding.setHandlerChain(handlerList);  
        } 

		System.out.println( service.webServiceMethod1() );
		//System.out.println( service.webServiceMethod1() );
		
	}

}
