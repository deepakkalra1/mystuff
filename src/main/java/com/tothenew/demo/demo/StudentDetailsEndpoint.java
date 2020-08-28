package com.tothenew.demo.demo;


import com.tothenew.demo.demo.studentSoapFiles.student.StudentDetails;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentDetailsEndpoint {

    @PayloadRoot(namespace = "/student", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public student.GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload student.GetStudentDetailsRequest request) {
        student.GetStudentDetailsResponse response = new student.GetStudentDetailsResponse();

        StudentDetails studentDetails = new StudentDetails();
        studentDetails.setId(request.getId());
        studentDetails.setName("Adam");
        studentDetails.setPassportNumber("E1234567");

        response.setStudentDetails(studentDetails);

        return response;
    }

}