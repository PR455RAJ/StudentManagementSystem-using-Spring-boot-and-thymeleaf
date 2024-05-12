package prk.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import prk.student_management_system.entity.Student;
import prk.student_management_system.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) 
	{
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception 
	{
//		Student student1=new Student(1,"Ramesh","Kumar","ramesh123@gmail.com");
//		studentRepository.save(student1);
//		Student student2=new Student(2,"Ram","sharma","ramu3@gmail.com");
//		studentRepository.save(student2);
//		Student student3=new Student(3,"Azad","Gupta","gupta149@gmail.com");
//		studentRepository.save(student3);
//		Student student4=new Student(4,"Sohan","Raj","sohana@gmail.com");
//		studentRepository.save(student4);
//		Student student5=new Student(5,"Laxman","Yadav","laxyadav231@gmail.com");
//		studentRepository.save(student5);
	}

}
