package task_13122023;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfigurationClass.class);
		((Baby) applicationContext.getBean("baby")).eat();
	}
	
}
//output:-Baby is eating icecream of Strawberry flavour