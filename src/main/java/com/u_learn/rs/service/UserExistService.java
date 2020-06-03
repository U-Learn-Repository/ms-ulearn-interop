package com.u_learn.rs.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.u_learn.rs.pojo.UserModel;
import com.u_learn.ws.client.UserExistClient;

@Path("/users")
public class UserExistService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserModel getUser(@PathParam("email") String email) {
        UserExistClient wsClient = new UserExistClient();
        return wsClient.getUserData(email);
    }
}
