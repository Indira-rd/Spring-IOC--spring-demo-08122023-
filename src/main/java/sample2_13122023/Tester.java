package sample2_13122023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//public class Tester {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//		System.out.println(applicationContext.getBean("mob"));
//		System.out.println(applicationContext.getBean("air"));
//	}
//}
//@Component("air")
//public class Airtel {
//
//}
//
//@Component("mob")
//public class Mobile {
//	Airtel airtel;
//	@Value("24000")
//	double prize;
//	String name;
//}
//output:-
//sample2_13122023.Mobile@4b0d79fc
//sample2_13122023.Airtel@29215f06


//public class Tester {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//		System.out.println(applicationContext.getBean("mob"));
//		System.out.println(applicationContext.getBean("air"));
//	}
//}
//@Component("air")
//public class Airtel {
//
//}
//
//@Component("mob")
//public class Mobile {
//	Airtel airtel;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [airtel=" + airtel + ", prize=" + prize + ", name=" + name + "]";
//	}	
//}
//output:-
//Mobile [airtel=null, prize=24000.0, name=null]
//sample2_13122023.Airtel@29215f06


//public class Tester {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//		System.out.println(applicationContext.getBean("mob"));
//		System.out.println(applicationContext.getBean("air"));
//	}
//}
//@Component("air")
//public class Airtel {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}
//
//@Component("mob")
//public class Mobile {
//	Airtel airtel;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [airtel=" + airtel + ", prize=" + prize + ", name=" + name + "]";
//	}
//	
//}
//output:-Mobile [airtel=null, prize=24000.0, name=null]
//		Airtel [chargePrice=0.0]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean("mob"));
//}
//}
//@Component("air")
//public class Airtel {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}
//
//@Component("mob")
//public class Mobile {
//	Airtel airtel;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [airtel=" + airtel + ", prize=" + prize + ", name=" + name + "]";
//	}
//	
//}
//OUTPUT:-Mobile [airtel=null, prize=24000.0, name=null]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean("mob"));
//}
//}
//@Component("air")
//public class Airtel {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}
//@Component("mob")
//public class Mobile {
//	@Autowired
//	Airtel airtel;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [airtel=" + airtel + ", prize=" + prize + ", name=" + name + "]";
//	}
//	
//}
//OUTPUT:-Mobile [airtel=Airtel [chargePrice=0.0], prize=24000.0, name=null]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean("mob"));
//}
//}
//@Component("air")
//public class Airtel {
//	double chargePrice;
//}
//@Component("mob")
//public class Mobile {
//	@Autowired
//	Airtel airtel;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [airtel=" + airtel + ", prize=" + prize + ", name=" + name + "]";
//	}
//	
//}
//OUTPUT:-Mobile [airtel=sample2_13122023.Airtel@4f80542f, prize=24000.0, name=null]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean("mob"));
//}
//}
//@Component("air")
//public class Airtel {
//}
//@Component("mob")
//public class Mobile {
//	@Autowired
//	Airtel airtel;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [airtel=" + airtel + ", prize=" + prize + ", name=" + name + "]";
//	}
//	
//}
//OUTPUT:-Mobile [airtel=sample2_13122023.Airtel@4f80542f, prize=24000.0, name=null]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean("mob"));
//}
//}
//
//@Configuration
//@ComponentScan("sample2_13122023")
//public class MyConfiguration {
//
//}
//
//@Component("mob")
//public class Mobile {
//	@Autowired
//	Sim sim;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [sim=" + sim + ", prize=" + prize + ", name=" + name + "]";
//	}
//}
//
//public interface Sim {
//
//}
//
//@Component("air")
//public class Airtel implements Sim {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}
//
//public class Jio implements Sim{
//
//	@Override
//	public String toString() {
//		return "JioSimObject";
//	}
//}
//
//output:-Mobile [sim=Airtel [chargePrice=0.0], prize=24000.0, name=null]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean("mob"));
//}
//}

//@Configuration
//@ComponentScan("sample2_13122023")
//public class MyConfiguration {
//
//}
//
//@Component("mob")
//public class Mobile {
//	@Autowired
//	Sim sim;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [sim=" + sim + ", prize=" + prize + ", name=" + name + "]";
//	}
//}
//
//public interface Sim {
//
//}
//
//@Component("air")
//public class Airtel implements Sim {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}

//@Component
//public class Jio implements Sim{
//
//	@Override
//	public String toString() {
//		return "JioSimObject";
//	}
//}
//
//output:-error(expected single matching bean but found 2: air,jio)


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean("mob"));
//}
//}

//@Configuration
//@ComponentScan("sample2_13122023")
//public class MyConfiguration {
//
//}
//
//@Component("mob")
//public class Mobile {
//	@Autowired
//	Sim sim;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [sim=" + sim + ", prize=" + prize + ", name=" + name + "]";
//	}
//}
//
//public interface Sim {
//
//}
//
//@Component("air")
//public class Airtel implements Sim {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}

//@Primary
//@Component
//public class Jio implements Sim{
//
//	@Override
//	public String toString() {
//		return "JioSimObject";
//	}
//}
//
//output:-Mobile [sim=JioSimObject, prize=24000.0, name=null]


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean("mob"));
//}
//}

//@Configuration
//@ComponentScan("sample2_13122023")
//public class MyConfiguration {
//
//}
//
//@Component("mob")
//public class Mobile {
//	@Autowired
//	Sim sim;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [sim=" + sim + ", prize=" + prize + ", name=" + name + "]";
//	}
//}
//
//public interface Sim {
//
//}

//@Primary
//@Component("air")
//public class Airtel implements Sim {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}
//
//@Primary
//@Component
//public class Jio implements Sim{
//
//	@Override
//	public String toString() {
//		return "JioSimObject";
//	}
//}
//
//output:-error(more than one 'primary' bean found among candidates: [air, jio])


//public class Tester {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
//	System.out.println(applicationContext.getBean("mob"));
//}
//}

//@Configuration
//@ComponentScan("sample2_13122023")
//public class MyConfiguration {
//
//}
//

//@Component("mob")
//public class Mobile {
//	@Qualifier("jio")
//	@Autowired
//	Sim sim;
//	@Value("24000")
//	double prize;
//	String name;
//	@Override
//	public String toString() {
//		return "Mobile [sim=" + sim + ", prize=" + prize + ", name=" + name + "]";
//	}
//}

//public interface Sim {
//
//}

//@Primary
//@Component("air")
//public class Airtel implements Sim {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}
//
//@Primary
//@Component
//public class Jio implements Sim{
//
//	@Override
//	public String toString() {
//		return "JioSimObject";
//	}
//}

//output:-Mobile [sim=JioSimObject, prize=24000.0, name=null]


public class Tester {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
	System.out.println(applicationContext.getBean("mob"));
}
}