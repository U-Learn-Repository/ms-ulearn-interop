package com.u_learn.rs.client;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.u_learn.ws.pojo.CoursePojo;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

public class CoursesClient {
    private static final String REST_TARGET_URL = System.getenv("RS_ENDPOINT");
    private static final String COURSES_LIST = "curso/consultaprofesor";
    private Response response;

    public List<CoursePojo> getCourses(String teacherId) {
        System.out.println("Consultando: " + REST_TARGET_URL + COURSES_LIST + "?idProfesor=" + teacherId);
        response = ClientBuilder.newClient()
			.target(REST_TARGET_URL)
			.path(COURSES_LIST)
			.queryParam("idProfesor", teacherId)
			.request(MediaType.APPLICATION_JSON)
			.get();
        if (response.getStatus() != Status.ACCEPTED.getStatusCode()) {
            return Collections.emptyList();
        }
        return response.readEntity(new GenericType<List<CoursePojo>>() {});
    }
}
