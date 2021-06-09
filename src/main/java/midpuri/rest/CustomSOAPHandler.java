package midpuri.rest;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class CustomSOAPHandler implements SOAPHandler<SOAPMessageContext> {

    private static final String AUTHORIZATION = "Authorization";
    private String userDetails;

    @Override
    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        try {
            final SOAPMessage soapMessage = soapMessageContext.getMessage();
            SOAPHeader soapHeader = soapMessage.getSOAPHeader();
            final SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
            if (soapHeader == null) {
                soapHeader = soapEnvelope.addHeader();
            }
            QName qNameUserCredentials = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", AUTHORIZATION);
            final SOAPElement auth = soapHeader.addHeaderElement(qNameUserCredentials);
            auth.addTextNode(userDetails);
            soapMessage.saveChanges();
            soapMessage.writeTo(System.out);
        } catch (Exception e) {

        }

        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    public void close(MessageContext context) {
    }

    public Set<QName> getHeaders() {
        return null;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }
}
