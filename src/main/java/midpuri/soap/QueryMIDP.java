
package midpuri.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "QueryMIDP", targetNamespace = "http://midpuri.org")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QueryMIDP {


    /**
     * 
     * @param queryMIDP
     * @return
     *     returns org.midpuri.soap.APLCTIONRES
     */
    @WebMethod
    @WebResult(name = "APLCTION_RES", targetNamespace = "http://midpuri.org", partName = "responseMIDP")
    public APLCTIONRES queryMIDP(
            @WebParam(name = "APLCTION_REQ", targetNamespace = "http://midpuri.org", partName = "queryMIDP")
                    APLCTIONREQ queryMIDP);

}