package com.u_learn.ws.client;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import com.u_learn.rs.pojo.UserHelper;
import com.u_learn.rs.pojo.UserModel;
import com.u_learn.ws.pojo.ViewModelResponse;
import com.u_learn.ws.pojo.ViewModelUser;

public class UserExistClient {
    private static final String SOAP_TARGET_URL = System.getenv("WS_ENDPOINT");

    public UserModel getUserData(String email) {
        ViewModelResponse response = null;
        String wsdlURL = SOAP_TARGET_URL + "?wsdl";
        System.out.println("Consultando: " + wsdlURL);
        Service1 service = new Service1();
        IService1 proxy = service.getBasicHttpBindingIService1();
        cambiarEndpointWS((BindingProvider) proxy, wsdlURL);
        try {            
            response = proxy.existUser(email);
        } catch (WebServiceException e) {
            e.printStackTrace();
            return new UserModel();
        }
        response.getResponse();
        ViewModelUser user = response.getUser().getValue();
        return UserHelper.mapping(user);
    }

    private void cambiarEndpointWS(BindingProvider provider, String newUrl) {
        provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, newUrl);
    }

}
