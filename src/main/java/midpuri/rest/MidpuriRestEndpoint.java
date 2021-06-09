package midpuri.rest;

import midpuri.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import java.util.List;

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
        final Binding binding = bindingProvider.getBinding();
        final List<Handler> handlerChain = binding.getHandlerChain();
        final CustomSOAPHandler customSOAPHandler = new CustomSOAPHandler();
        customSOAPHandler.setUserDetails(soapAuth);
        handlerChain.add(customSOAPHandler);
        binding.setHandlerChain(handlerChain);

        APLCTIONREQ aplctionrequest = new APLCTIONREQ();
        //create builder for APLCTIONREQ Object
        APLCTIONRES aplctionres = queryMIDPEndPoint.queryMIDP(aplctionrequest);

        return aplctionres;
    }
}
