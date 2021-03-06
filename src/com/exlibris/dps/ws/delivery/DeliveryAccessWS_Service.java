
package com.exlibris.dps.ws.delivery;

import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 *
 */
@WebServiceClient(name = "DeliveryAccessWS", targetNamespace = "http://dps.exlibris.com/")
public class DeliveryAccessWS_Service
    extends Service
{

//    private final static URL DELIVERYACCESSWS_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.exlibris.dps.ws.delivery.DeliveryAccessWS_Service.class.getName());

    public DeliveryAccessWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     *
     * @return
     *     returns DeliveryAccessWS
     */
    @WebEndpoint(name = "DeliveryAccessWSPort")
    public DeliveryAccessWS getDeliveryAccessWSPort() {
        return super.getPort(new QName("http://dps.exlibris.com/", "DeliveryAccessWSPort"), DeliveryAccessWS.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeliveryAccessWS
     */
    @WebEndpoint(name = "DeliveryAccessWSPort")
    public DeliveryAccessWS getDeliveryAccessWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dps.exlibris.com/", "DeliveryAccessWSPort"), DeliveryAccessWS.class, features);
    }

}
