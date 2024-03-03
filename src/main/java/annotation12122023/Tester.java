package annotation12122023;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotation12122023/newFileA.xml");
//}
//}
//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//}
//<bean id="m1" class="annotation12122023.Mobile"></bean>
//output:-
//mobile object created


//public class Tester{
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotation12122023/newFileA.xml");
//	}
//}
//@Component
//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//}
//@Component
//public class Laptop {
//	public Laptop() {
//		System.out.println("laptop object got created");
//	}
//}
//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xmlns:context="http://www.springframework.org/schema/context"
//xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
//<context:component-scan base-package="annotation12122023"></context:component-scan>
//</beans>
//output:-
//laptop object got created
//mobile object created


//public class Tester{
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	}
//}
//@Component
//public class Laptop {
//	public Laptop() {
//		System.out.println("laptop object got created");
//	}
//}
//@Component
//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//}
//@Configuration
//@ComponentScan("annotation12122023")
//public class MyConfiguration {
//}
//output:-
//laptop object got created
//mobile object created


//public class Tester{
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//		System.out.println(applicationContext.getBean(Laptop.class));
//		System.out.println(applicationContext.getBean(Mobile.class));
//	}
//}
//@Component
//public class Laptop {
//	public Laptop() {
//		System.out.println("laptop object got created");
//	}
//}
//@Component
//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//}
//@Configuration
//@ComponentScan("annotation12122023")
//public class MyConfiguration {
//}
//laptop object got created
//mobile object created
//annotation12122023.Laptop@58695725
//annotation12122023.Mobile@543588e6


//public class Tester{
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//		System.out.println(applicationContext.getBean(Laptop.class));
//		System.out.println(applicationContext.getBean(Mobile.class));
//		System.out.println(applicationContext.getBean(Laptop.class));
//		System.out.println(applicationContext.getBean(Mobile.class));
//	}
//}
//@Scope("prototype")
//@Component
//public class Laptop {
//	public Laptop() {
//		System.out.println("laptop object got created");
//	}
//}
//@Component
//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//}
//@Configuration
//@ComponentScan("annotation12122023")
//public class MyConfiguration {
//}
//mobile object created
//laptop object got created
//annotation12122023.Laptop@52af26ee
//annotation12122023.Mobile@6fd83fc1
//laptop object got created
//annotation12122023.Laptop@4f2b503c
//annotation12122023.Mobile@6fd83fc1


//public class Tester{
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//		System.out.println(applicationContext.getBean(Laptop.class));
//		System.out.println(applicationContext.getBean(Mobile.class));
//		System.out.println(applicationContext.getBean(Laptop.class));
//		System.out.println(applicationContext.getBean(Mobile.class));
//	}
//}
//@Scope("prototype")
//@Component
//public class Laptop {
//	public Laptop() {
//		System.out.println("laptop object got created");
//	}
//}
//@Lazy
//@Component()
//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//}
//@Configuration
//@ComponentScan("annotation12122023")
//public class MyConfiguration {
//}
//laptop object got created
//annotation12122023.Laptop@bae7dc0
//mobile object created
//annotation12122023.Mobile@209da20d
//laptop object got created
//annotation12122023.Laptop@e15b7e8
//annotation12122023.Mobile@209da20d


//public class Tester{
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean(Laptop.class));
//	System.out.println(applicationContext.getBean(Mobile.class));
//	System.out.println(applicationContext.getBean(Laptop.class));
//	System.out.println(applicationContext.getBean(Mobile.class));
//}
//}
//@Scope("prototype")
//@Component
//public class Laptop {
//	public Laptop() {
//		System.out.println("laptop object got created");
//	}
//	@PostConstruct
//	void start() {
//		System.out.println("postConstruct annotation worked");
//	}
//	@PreDestroy
//	void stop() {
//		System.out.println("preDestroy annotation worked");
//	}
//}
////@Lazy
//@Component()
//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//}
//@Configuration
//@ComponentScan("annotation12122023")
//public class MyConfiguration {
//}
//laptop object got created
//postConstruct annotation worked
//annotation12122023.Laptop@4b8ee4de
//mobile object created
//annotation12122023.Mobile@27f981c6
//laptop object got created
//postConstruct annotation worked
//annotation12122023.Laptop@1b11171f
//annotation12122023.Mobile@27f981c6


//public class Tester{
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	Mobile mobile=(Mobile) applicationContext.getBean("mobile");
//	System.out.println(mobile.brand);
//	System.out.println(mobile.colour);
//	System.out.println(mobile.price);
//}
//}
//@Scope("prototype")
//@Component
//public class Laptop {
//	public Laptop() {
//		System.out.println("laptop object got created");
//	}
//	@PostConstruct
//	void start() {
//		System.out.println("postConstruct annotation worked");
//	}
//	@PreDestroy
//	void stop() {
//		System.out.println("preDestroy annotation worked");
//	}
//}
//@Lazy
//@Component()
//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//	@Value("samsung")
//	String brand;
//	@Value("25000")
//	int price;
//	String colour;
//}
//@Configuration
//@ComponentScan("annotation12122023")
//public class MyConfiguration {
//}
//output:-
//mobile object created
//samsung
//null
//25000


//Mobile mobile=(Mobile) applicationContext.getBean("m1");
//ApplicationContext context=new AnnotationConfigApplicationContext("MyConfiguration.class");


//public class Tester{
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	Mobile mobile=(Mobile) applicationContext.getBean("mobile");
//	System.out.println(mobile.brand);
//	System.out.println(mobile.colour);
//	System.out.println(mobile.price);
//}
//}
//import java.beans.JavaBean;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//@Lazy
//@Component()
//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//	@Value("samsung")
//	String brand;
//	@Value("25000")
//	int price;
//	String colour;
//}
//package annotation12122023;
//
//public @interface PostConstruct {
//
//}
//package annotation12122023;
//
//public @interface PreDestroy {
//
//}
//package annotation12122023;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan("annotation12122023")
//public class MyConfiguration {
//
//}
//output:-
//mobile object created
//samsung
//null
//25000