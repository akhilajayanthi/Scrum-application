package com.cxf.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
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

import org.springframework.stereotype.Service;

import com.cxf.bean.Student;

@Service("studentService")
@Path("/students")
public class StudentService {

	private HashMap<Integer, Student> students = new HashMap<Integer, Student>();

	public void init() {
		students.put(101, new Student(101, "akhila", 18));
		students.put(102, new Student(102, "jayanthi", 19));

	}

	public StudentService() {

		init();
	}

	@Path("/create/{id}/{name}/{age}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student addStudent(@PathParam("id") int id, @PathParam("name") String name, @PathParam("age") int age) {
		Student student = new Student(id, name, age);
		students.put(id, student);
		System.out.println(student);
		return student;
	}

	@Path("/del/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student deleteStudent(@PathParam("id") int id) {
		Student s = findById(id);
		students.remove(id);
		System.out.println(s);
		return s;
	}

	@GET
	@Produces({ "application/json", "application/xml" })
	public Collection<Student> getStudents() {
		System.out.println(students);
		return students.values();
	}

	@PUT
	@Path("/update/{studentId}/{name}/{age}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateStudent(@PathParam("studentId") int studentId, @PathParam("name") String name,
			@PathParam("age") int age) {

		Student student = new Student(studentId, name, age);
		Student existingStudent = findById(studentId);
		if (existingStudent != null) {
			students.put(studentId, student);
			return "student data updated as: " + student;
		} else {
			return "data does not exist";
		}
	}

	private Student findById(int id) {
		for (Map.Entry<Integer, Student> entry : students.entrySet()) {
			if (entry.getKey() == id) {
				return entry.getValue();
			}
		}
		return null;
	}
}
