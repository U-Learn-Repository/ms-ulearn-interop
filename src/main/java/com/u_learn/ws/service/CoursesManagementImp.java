package com.u_learn.ws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.u_learn.rs.client.CoursesClient;
import com.u_learn.ws.pojo.CoursePojo;

@WebService(serviceName = "soap/CoursesListService", name = "CoursesList", portName = "CoursesList")
public class CoursesManagementImp implements CoursesManagement {
    @WebMethod
    public List<CoursePojo> getCourseInformation(String teacherId) {
        CoursesClient rsClient = new CoursesClient();
        return rsClient.getCourses(teacherId);
    }
}