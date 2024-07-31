package in.naresh;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.naresh.entity.Student;
import in.naresh.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ConfigurableApplicationContext cntx = 
			  SpringApplication.run(Application.class, args);
	  
	  StudentRepository repo = cntx.getBean(StudentRepository.class);
	  
	  Student s = new Student();
	 
	  s.setStudentName("RAJU");
	  s.setGender("male");
	  s.setStudentBranch("EEE");
	  
	  repo.save(s);
}
}
