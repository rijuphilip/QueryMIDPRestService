package midpuri.rest;

import midpuri.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MidpuriRestEndpoint {

    private static final String NAMESPACE_URI = "http://midpuri.org";

    @Value("${midpuri.soap.endpoint}")
    private String soapEndPoint;
    @Value("${midpuri.soap.auth}")
    private String soapAuth;

    @Autowired
    public MidpuriRestEndpoint() {
    }

    @RequestMapping(value = "/query", produces = {"application/xml", "application/json"}, consumes = {"application/xml", "application/json"}, method = RequestMethod.POST)
    public APLCTIONRES queryMIDPRestService(@RequestBody AplctionreqRest aplctionreq) {

        final QueryMIDPService queryMIDPService = new QueryMIDPService();
        final QueryMIDP queryMIDPEndPoint = queryMIDPService.getQueryMIDPSoap12();
        final BindingProvider bindingProvider = (BindingProvider) queryMIDPEndPoint;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, soapEndPoint);
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Authorization", Arrays.asList(soapAuth));
        bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS,headers);

        APLCTIONREQ aplctionrequest = new APLCTIONREQ();
        //create builder for APLCTIONREQ Object
        APLCTIONRES aplctionres = queryMIDPEndPoint.queryMIDP(aplctionrequest);

        return aplctionres;
    }
}
