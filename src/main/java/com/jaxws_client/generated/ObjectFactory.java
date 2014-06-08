
package com.jaxws_client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jaxws_client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateUserResponse_QNAME = new QName("http://jaxws_web.com/", "updateUserResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://jaxws_web.com/", "updateUser");
    private final static QName _WebServiceMethod1_QNAME = new QName("http://jaxws_web.com/", "webServiceMethod1");
    private final static QName _WebServiceMethod1Response_QNAME = new QName("http://jaxws_web.com/", "webServiceMethod1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jaxws_client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link WebServiceMethod1 }
     * 
     */
    public WebServiceMethod1 createWebServiceMethod1() {
        return new WebServiceMethod1();
    }

    /**
     * Create an instance of {@link WebServiceMethod1Response }
     * 
     */
    public WebServiceMethod1Response createWebServiceMethod1Response() {
        return new WebServiceMethod1Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws_web.com/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws_web.com/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceMethod1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws_web.com/", name = "webServiceMethod1")
    public JAXBElement<WebServiceMethod1> createWebServiceMethod1(WebServiceMethod1 value) {
        return new JAXBElement<WebServiceMethod1>(_WebServiceMethod1_QNAME, WebServiceMethod1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceMethod1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws_web.com/", name = "webServiceMethod1Response")
    public JAXBElement<WebServiceMethod1Response> createWebServiceMethod1Response(WebServiceMethod1Response value) {
        return new JAXBElement<WebServiceMethod1Response>(_WebServiceMethod1Response_QNAME, WebServiceMethod1Response.class, null, value);
    }

}
