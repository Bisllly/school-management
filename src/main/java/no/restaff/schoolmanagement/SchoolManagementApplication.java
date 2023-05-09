package no.restaff.schoolmanagement;

import no.restaff.schoolmanagement.repository.StudentRepository;
import no.restaff.schoolmanagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"no.restaff.schoolmanagement.controller", "no.restaff.schoolmanagement.service",
		"no.restaff.schoolmanagement.config"})
public class SchoolManagementApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	private TeacherRepository teacherRepository;

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Sanjay", "Jadhav", "Sanjay@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("tony", "stark", "tony@gmail.com");
//		studentRepository.save(student3);
	}
}
