package com.u_learn.ws.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.u_learn.ws.pojo.CoursePojo;

@WebService(name = "CoursesList")
public interface CoursesManagement {
    public List<CoursePojo> getCourseInformation(@WebParam(name = "teacherId") String teacherId);
}