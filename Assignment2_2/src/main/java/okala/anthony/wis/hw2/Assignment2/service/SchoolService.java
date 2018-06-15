package okala.anthony.wis.hw2.Assignment2.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import okala.anthony.wis.hw2.Assignment2.IFimplementation.Student;

@RestController
@RequestMapping(value = "/rest/school")
public class SchoolService {

	@RequestMapping(value = "/students/{id}")
	public Student getStudent(@PathVariable String id) {
		String URL = "http://localhost:8080/rest/student/" + id;
		RestTemplate template = new RestTemplate();
		Student student = template.getForObject(URL, Student.class);
		return student;
	}

}
