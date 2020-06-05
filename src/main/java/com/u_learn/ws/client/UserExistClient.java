package com.u_learn.ws.client;

import javax.xml.ws.BindingProvider;

import com.u_learn.rs.pojo.UserHelper;
import com.u_learn.rs.pojo.UserModel;
import com.u_learn.ws.pojo.ViewModelResponse;
import com.u_learn.ws.pojo.ViewModelUser;

public class UserExistClient {
    private static final String SOAP_TARGET_URL = System.getenv("WS_ENDPOINT");

    public UserModel getUserData(String email) {
        ViewModelResponse response = null;
        String wsdlURL = SOAP_TARGET_URL;
        System.out.println("Consumiendo: " + wsdlURL + "?wsdl");
        Service1 service = new Service1();
        IService1 proxy = service.getBasicHttpBindingIService1();
        ((BindingProvider)proxy).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, SOAP_TARGET_URL);
        try {
            response = proxy.existUser(email);
        } catch (Exception e) {
            e.printStackTrace();
            return new UserModel();
        }
        ViewModelUser user = response.getUser().getValue();
		if(!(user instanceof ViewModelUser)){
			return new UserModel();
		}
        return UserHelper.mapping(user);
    }
}
