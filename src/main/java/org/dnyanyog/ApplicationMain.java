package org.dnyanyog;

import org.dnyanyog.component.Student;
import org.dnyanyog.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		//spring run
		ApplicationContext spring =new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student app =spring.getBean(Student.class);
		app.setFirstName("hrishikesh");
	System.out.println(app.getFirstName());
	
		app.getAddress().setCity("kurduwadi");
		System.out.println(app.getAddress().getCity());
		
	}

	
}
