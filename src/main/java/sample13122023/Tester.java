package sample13122023;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//public class Tester {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);//we have to pass configuration class //this will prepare the class
//		System.out.println(applicationContext.getBean("mobile"));
//	}
//}
//@Component
//@Scope("prototype")
//public class Mobile {
//	@Override
//	public String toString() {
//		return "Mobile [prize=" + prize + ", size=" + size + "]";
//	}
//	double prize;
//	public void setPrize(double prize) {
//		this.prize = prize;
//	}
//	public void setSize(int size) {
//		this.size = size;
//	}
//	int size;
//
//}
//@Configuration
//@ComponentScan("sample13122023")
//public class MyConfig {
//
//}
//Mobile [prize=0.0, size=0]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);//we have to pass configuration class //this will preparethe class
//	System.out.println(applicationContext.getBean("mobile"));
//}
//}
//@Component
//@Scope("prototype")
//public class Mobile {
//	@Override
//	public String toString() {
//		return "Mobile [prize=" + prize + ", size=" + size + "]";
//	}
//	double prize;
//	@Value("25000")
//	public void setPrize(double prize) {
//		this.prize = prize;
//	}
//	public void setSize(int size) {
//		this.size = size;
//	}
//	int size;
//
//}
//OUTPUT:- Mobile [prize=25000.0, size=0]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);//we have to pass configuration class //this will preparethe class
//	System.out.println(applicationContext.getBean("mobile"));
//}
//}
//@Component
//@Scope("prototype")
//public class Mobile {
//	public Mobile(double prize, int size) {
//		super();
//		this.prize = prize;
//		this.size = size;
//	}
//	public Mobile(){
//		
//	}
//	@Override
//	public String toString() {
//		return "Mobile [prize=" + prize + ", size=" + size + "]";
//	}
//	double prize;
//	@Value("25000")
//	public void setPrize(double prize) {
//		this.prize = prize;
//	}
//	public void setSize(int size) {
//		this.size = size;
//	}
//	int size;
//
//}
//output:-Mobile [prize=25000.0, size=0]
		
//		
//		public class Tester {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);//we have to pass configuration class //this will preparethe class
//		System.out.println(applicationContext.getBean("mobile"));
//	}
//	}
//	@Component
//	@Scope("prototype")
//	public class Mobile {
//		public Mobile(double prize, int size) {
//			super();
//			this.prize = prize;
//			this.size = size;
//		}
//		@Override
//		public String toString() {
//			return "Mobile [prize=" + prize + ", size=" + size + "]";
//		}
//		double prize;
//		@Value("25000")
//		public void setPrize(double prize) {
//			this.prize = prize;
//		}
//		public void setSize(int size) {
//			this.size = size;
//		}
//		int size;
//
//	}
//	output:-error  (my assumption of getting error:to use setter injection there should be default constructor. but here i am creating a constructor. that's why here there is no default constructor. so setter injection is not possible. so, i am not getting default values here.)
//Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'mobile' defined in file [F:\spring_jspiders\spring-demo-08122023\target\classes\sample13122023\Mobile.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'double' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);//we have to pass configuration class //this will preparethe class
//	System.out.println(applicationContext.getBean("mobile"));
//}
//}
//@Component
//@Scope("prototype")
//public class Mobile {
//	public Mobile(double prize, int size) {
//		super();
//		this.prize = prize;
//		this.size = size;
//	}
//	public Mobile(){
//		
//	}
//	@Override
//	public String toString() {
//		return "Mobile [prize=" + prize + ", size=" + size + "]";
//	}
//	double prize;
//	@Value("25000")
//	public void setPrize(double prize) {
//		this.prize = prize;
//	}
//	public void setSize(int size) {
//		this.size = size;
//	}
//	@Value("8")//WHEN we use constructor injection we need to write @value just above the variable name
//	int size;
//
//}
//OUTPUT:-Mobile [prize=25000.0, size=8]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);//we have to pass configuration class //this will preparethe class
//	System.out.println(applicationContext.getBean("mob"));
//}
//}
//@Component("mob")
//@Scope("prototype")
//public class Mobile {
//	public Mobile(double prize, int size) {
//		super();
//		this.prize = prize;
//		this.size = size;
//	}
//	public Mobile(){
//		
//	}
//	@Override
//	public String toString() {
//		return "Mobile [prize=" + prize + ", size=" + size + "]";
//	}
//	double prize;
//	@Value("25000")
//	public void setPrize(double prize) {
//		this.prize = prize;
//	}
//	public void setSize(int size) {
//		this.size = size;
//	}
//	@Value("8")
//	int size;
//
//}
//output:-Mobile [prize=25000.0, size=8]