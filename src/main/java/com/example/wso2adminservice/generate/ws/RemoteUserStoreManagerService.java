
package com.example.wso2adminservice.generate.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RemoteUserStoreManagerService", targetNamespace = "http://service.ws.um.carbon.wso2.org", wsdlLocation = "file:/C:/STS_WS/wso2adminservice/src/main/resources/wsdl/RemoteUserStoreManagerService.wsdl")
public class RemoteUserStoreManagerService
    extends Service
{

    private final static URL REMOTEUSERSTOREMANAGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException REMOTEUSERSTOREMANAGERSERVICE_EXCEPTION;
    private final static QName REMOTEUSERSTOREMANAGERSERVICE_QNAME = new QName("http://service.ws.um.carbon.wso2.org", "RemoteUserStoreManagerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/STS_WS/wso2adminservice/src/main/resources/wsdl/RemoteUserStoreManagerService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REMOTEUSERSTOREMANAGERSERVICE_WSDL_LOCATION = url;
        REMOTEUSERSTOREMANAGERSERVICE_EXCEPTION = e;
    }

    public RemoteUserStoreManagerService() {
        super(__getWsdlLocation(), REMOTEUSERSTOREMANAGERSERVICE_QNAME);
    }

    public RemoteUserStoreManagerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REMOTEUSERSTOREMANAGERSERVICE_QNAME, features);
    }

    public RemoteUserStoreManagerService(URL wsdlLocation) {
        super(wsdlLocation, REMOTEUSERSTOREMANAGERSERVICE_QNAME);
    }

    public RemoteUserStoreManagerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REMOTEUSERSTOREMANAGERSERVICE_QNAME, features);
    }

    public RemoteUserStoreManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RemoteUserStoreManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RemoteUserStoreManagerServicePortType
     */
    @WebEndpoint(name = "RemoteUserStoreManagerServiceHttpsSoap11Endpoint")
    public RemoteUserStoreManagerServicePortType getRemoteUserStoreManagerServiceHttpsSoap11Endpoint() {
        return super.getPort(new QName("http://service.ws.um.carbon.wso2.org", "RemoteUserStoreManagerServiceHttpsSoap11Endpoint"), RemoteUserStoreManagerServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RemoteUserStoreManagerServicePortType
     */
    @WebEndpoint(name = "RemoteUserStoreManagerServiceHttpsSoap11Endpoint")
    public RemoteUserStoreManagerServicePortType getRemoteUserStoreManagerServiceHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ws.um.carbon.wso2.org", "RemoteUserStoreManagerServiceHttpsSoap11Endpoint"), RemoteUserStoreManagerServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REMOTEUSERSTOREMANAGERSERVICE_EXCEPTION!= null) {
            throw REMOTEUSERSTOREMANAGERSERVICE_EXCEPTION;
        }
        return REMOTEUSERSTOREMANAGERSERVICE_WSDL_LOCATION;
    }

}