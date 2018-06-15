package okala.anthony.wis.hw2.Assignment2;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import okala.anthony.wis.hw2.Assignment2.IFimplementation.Student;

@SpringBootApplication
public class Assignment2Application {
	public static HashMap<Long, Student> hmStudent;

	public static void main(String[] args) {
		hmStudent= new HashMap<>();
		
		Student one = new Student("Anthony Okala", "WIS");
		hmStudent.put(new Long(one.getId()), one);
		
		SpringApplication.run(Assignment2Application.class, args);
	}
}
