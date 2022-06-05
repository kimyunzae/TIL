package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import frame.TV;

public class Controller {

	public static void main(String[] args) {
		System.out.println("App Start ...."); 
		
		System.out.println("Spring Start ..");
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Spring End ..");
		
		TV tv = (TV) factory.getBean("LG");
		tv.on();
		tv.off();    
		
		System.out.println("App End ....");
		

	}

}
