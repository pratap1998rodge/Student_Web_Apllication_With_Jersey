package com.anytimedeveloper.student.Student_Project;

import java.net.URISyntaxException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.anytimedeveloper.student.bean.Student;



@Path("student")
public class Student_Resource {

	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/get{sid}")
    @Produces(MediaType.APPLICATION_XML)
    
    public Student getEmployee(@PathParam("sid")int sid) {
		
    	
    	Student student=new Student();
    	student.setSid(101);
    	student.setSname("Pratap");
    	student.setDob("1998-08-04");
    	student.setDoj("2021-04-12");
    	
    	return student;
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    
    public Student createStudent(Student student) {
    	
    	//create logic goes here
    	return student;
    	
    }
    
    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Student updateStudent(Student student) {
    	
    	//create update logic here
    	student.setSname(student.getSname()+"updated");
    	student.setDob(student.getDob()+"updated");
    	student.setDoj(student.getDoj()+"updated");
    	
    	return student;
    }
    
    @DELETE
    @Path("/delete{sid}")
    public Response deleteStudent(@PathParam("sid")int sid)throws URISyntaxException{
    	
    	return Response.status(200).entity("Employee with"+sid+"is deleted Successfully").build();
    }
    
    
    
    
    
}//class

	
	

