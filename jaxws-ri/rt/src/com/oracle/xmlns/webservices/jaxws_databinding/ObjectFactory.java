//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6-SNAPSHOT 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.21 at 10:57:01 AM CET 
//


package com.oracle.xmlns.webservices.jaxws_databinding;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.xml.ws.ext2.java_wsdl package. 
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

    private final static QName _JavaWsdlMapping_QNAME = new QName("http://xmlns.oracle.com/webservices/jaxws-databinding", "java-wsdl-mapping");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.xml.ws.ext2.java_wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JavaMethod }
     * 
     */
    public JavaMethod createJavaMethod() {
        return new JavaMethod();
    }

    /**
     * Create an instance of {@link JavaWsdlMappingType }
     * 
     */
    public JavaWsdlMappingType createJavaWsdlMappingType() {
        return new JavaWsdlMappingType();
    }

    /**
     * Create an instance of {@link WebEndpoint }
     * 
     */
    public WebEndpoint createWebEndpoint() {
        return new WebEndpoint();
    }

    /**
     * Create an instance of {@link Mtom }
     * 
     */
    public Mtom createMtom() {
        return new Mtom();
    }

    /**
     * Create an instance of {@link WebServiceClient }
     * 
     */
    public WebServiceClient createWebServiceClient() {
        return new WebServiceClient();
    }

    /**
     * Create an instance of {@link ServiceMode }
     * 
     */
    public ServiceMode createServiceMode() {
        return new ServiceMode();
    }

    /**
     * Create an instance of {@link BindingType }
     * 
     */
    public BindingType createBindingType() {
        return new BindingType();
    }

    /**
     * Create an instance of {@link WebServiceRef }
     * 
     */
    public WebServiceRef createWebServiceRef() {
        return new WebServiceRef();
    }

    /**
     * Create an instance of {@link JavaParam }
     * 
     */
    public JavaParam createJavaParam() {
        return new JavaParam();
    }

    /**
     * Create an instance of {@link WebParam }
     * 
     */
    public WebParam createWebParam() {
        return new WebParam();
    }

    /**
     * Create an instance of {@link WebMethod }
     * 
     */
    public WebMethod createWebMethod() {
        return new WebMethod();
    }

    /**
     * Create an instance of {@link WebResult }
     * 
     */
    public WebResult createWebResult() {
        return new WebResult();
    }

    /**
     * Create an instance of {@link Oneway }
     * 
     */
    public Oneway createOneway() {
        return new Oneway();
    }

    /**
     * Create an instance of {@link SoapBinding }
     * 
     */
    public SoapBinding createSoapBinding() {
        return new SoapBinding();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link FaultAction }
     * 
     */
    public FaultAction createFaultAction() {
        return new FaultAction();
    }

    /**
     * Create an instance of {@link JavaMethod.JavaParams }
     * 
     */
    public JavaMethod.JavaParams createJavaMethodJavaParams() {
        return new JavaMethod.JavaParams();
    }

    /**
     * Create an instance of {@link HandlerChain }
     * 
     */
    public HandlerChain createHandlerChain() {
        return new HandlerChain();
    }

    /**
     * Create an instance of {@link WebServiceProvider }
     * 
     */
    public WebServiceProvider createWebServiceProvider() {
        return new WebServiceProvider();
    }

    /**
     * Create an instance of {@link WebFault }
     * 
     */
    public WebFault createWebFault() {
        return new WebFault();
    }

    /**
     * Create an instance of {@link ResponseWrapper }
     * 
     */
    public ResponseWrapper createResponseWrapper() {
        return new ResponseWrapper();
    }

    /**
     * Create an instance of {@link WebService }
     * 
     */
    public WebService createWebService() {
        return new WebService();
    }

    /**
     * Create an instance of {@link RequestWrapper }
     * 
     */
    public RequestWrapper createRequestWrapper() {
        return new RequestWrapper();
    }

    /**
     * Create an instance of {@link JavaWsdlMappingType.XmlSchemaMapping }
     * 
     */
    public JavaWsdlMappingType.XmlSchemaMapping createJavaWsdlMappingTypeXmlSchemaMapping() {
        return new JavaWsdlMappingType.XmlSchemaMapping();
    }

    /**
     * Create an instance of {@link JavaWsdlMappingType.JavaMethods }
     * 
     */
    public JavaWsdlMappingType.JavaMethods createJavaWsdlMappingTypeJavaMethods() {
        return new JavaWsdlMappingType.JavaMethods();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JavaWsdlMappingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/webservices/jaxws-databinding", name = "java-wsdl-mapping")
    public JAXBElement<JavaWsdlMappingType> createJavaWsdlMapping(JavaWsdlMappingType value) {
        return new JAXBElement<JavaWsdlMappingType>(_JavaWsdlMapping_QNAME, JavaWsdlMappingType.class, null, value);
    }

}
