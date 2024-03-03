package springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class Tester2 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//		Car car=(Car) applicationContext.getBean("c1");
//		Bus bus=(Bus) applicationContext.getBean("b1");
//		System.out.println(car);
//		System.out.println(bus);
//	}
//}
//output:- 
//springdemo1.Car@1573f9fc
//springdemo1.Bus@6150c3ec

//the following output i am getting after creating the constructor for both car and bus class
//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//<bean id="b1" class="springdemo1.Bus"></bean>
//BUs object got created
//Car object got created
//springdemo1.Car@1573f9fc
//springdemo1.Bus@6150c3ec

//<bean id="c1" class="springdemo1.Car"></bean>
//<bean id="b1" class="springdemo1.Bus" scope="prototype"></bean>
//Car object got created
//BUs object got created
//springdemo1.Car@1573f9fc
//springdemo1.Bus@6150c3ec

//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//<bean id="b1" class="springdemo1.Bus" scope="prototype"></bean>
//Car object got created
//BUs object got created
//springdemo1.Car@2d1ef81a
//springdemo1.Bus@4c402120

//<bean id="b1" class="springdemo1.Bus" scope="prototype"></bean>
//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//Car object got created
//BUs object got created
//springdemo1.Car@2d1ef81a
//springdemo1.Bus@4c402120


//public class Tester2 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//		Bus bus=(Bus) applicationContext.getBean("b1");
//		Car car=(Car) applicationContext.getBean("c1");
//		System.out.println(car);
//		System.out.println(bus);
//	}
//}
//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//<bean id="b1" class="springdemo1.Bus" scope="prototype"></bean>
//OUTPUT:-
//BUs object got created
//Car object got created
//springdemo1.Car@2d1ef81a
//springdemo1.Bus@4c402120

//public class Tester2 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//		Car car=(Car) applicationContext.getBean("c1");
//		Bus bus=(Bus) applicationContext.getBean("b1");
//		System.out.println(car);
//		System.out.println(bus);
//	}
//}
//<bean id="b1" class="springdemo1.Bus"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//BUs object got created
//Car object got created
//springdemo1.Car@1573f9fc
//springdemo1.Bus@6150c3ec

//public class Tester2 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Bus bus=(Bus) applicationContext.getBean("b1");
//	Car car=(Car) applicationContext.getBean("c1");
//	System.out.println(car);
//	System.out.println(bus);
//}
//}
//<bean id="b1" class="springdemo1.Bus"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//BUs object got created
//Car object got created
//springdemo1.Car@1573f9fc
//springdemo1.Bus@6150c3ec

//<bean id="b1" class="springdemo1.Bus" lazy-init="true"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//Car object got created
//BUs object got created
//springdemo1.Car@1573f9fc
//springdemo1.Bus@6150c3ec

//<bean id="b1" class="springdemo1.Bus" lazy-init="true"></bean>
//<bean id="c1" class="springdemo1.Car" lazy-init="true"></bean>
//BUs object got created
//Car object got created
//springdemo1.Car@815b41f
//springdemo1.Bus@5542c4ed

//<bean id="c1" class="springdemo1.Car" lazy-init="true"></bean>
//<bean id="b1" class="springdemo1.Bus" lazy-init="true"></bean>
//BUs object got created
//Car object got created
//springdemo1.Car@815b41f
//springdemo1.Bus@5542c4ed

//<bean id="b1" class="springdemo1.Bus" scope="prototype" lazy-init="false"></bean>
//<bean id="c1" class="springdemo1.Car" scope="prototype" lazy-init="true"></bean>
//BUs object got created
//Car object got created
//springdemo1.Car@2d1ef81a
//springdemo1.Bus@4c402120


//public class Tester2 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//		Car car=(Car) applicationContext.getBean("c1");
//		Bus bus=(Bus) applicationContext.getBean("b1");
//	}
//}
//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//<bean id="b1" class="springdemo1.Bus"></bean>
//output:-
//BUs object got created
//Car object got created

//<bean id="b1" class="springdemo1.Bus" lazy-init="true"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//Car object got created
//BUs object got created

//<bean id="b1" class="springdemo1.Bus" lazy-init="true"></bean>
//<bean id="c1" class="springdemo1.Car" lazy-init="true"></bean>
//Car object got created
//BUs object got created

//<bean id="b1" class="springdemo1.Bus" scope="prototype" lazy-init="false"></bean>
//<bean id="c1" class="springdemo1.Car" scope="prototype" lazy-init="true"></bean>
//Car object got created
//BUs object got created

//public class Tester2 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	}
//}
//output:-
//BUs object got created

//	<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//	<bean id="b1" class="springdemo1.Bus"></bean>


//public class Tester2 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	}
//}
//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//<bean id="b1" class="springdemo1.Bus" scope="prototype"></bean>

//output:-blank


//public class Tester2 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	}
//}
//<bean id="c1" class="springdemo1.Car"></bean>
//<bean id="b1" class="springdemo1.Bus"></bean>
//
//output:-
//Car object got created
//BUs object got created


//public class Tester2 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//}
//}
//<bean id="b1" class="springdemo1.Bus"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//OUTPUT:-
//BUs object got created
//Car object got created

//<bean id="b1" class="springdemo1.Bus" lazy-init="default"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//BUs object got created
//Car object got created

//<bean id="b1" class="springdemo1.Bus" lazy-init="false"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//BUs object got created
//Car object got created

//<bean id="b1" class="springdemo1.Bus" lazy-init="true"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//Car object got created


//<bean id="b1" class="springdemo1.Bus" scope="prototype" lazy-init="false"></bean>
//<bean id="c1" class="springdemo1.Car" scope="prototype" lazy-init="true"></bean>
//output:-no output(blank)


//public class Tester2 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Bus bus=(Bus) applicationContext.getBean("b1");
//	if(bus!=null)
//		bus.start();
//	Car car=(Car) applicationContext.getBean("c1");
//	System.out.println(car);
//	System.out.println(bus);
//}
//}
//<bean id="b1" class="springdemo1.Bus" scope="prototype" lazy-init="false" destroy-method="stop"></bean>
//<bean id="c1" class="springdemo1.Car" scope="prototype" lazy-init="true"></bean>
//BUs object got created
//init method is called a start method
//Car object got created
//springdemo1.Car@2d1ef81a
//springdemo1.Bus@4c402120


//public class Tester2 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Bus bus=(Bus) applicationContext.getBean("b1");
//	if(bus!=null)
//		bus.start();
//	Car car=(Car) applicationContext.getBean("c1");
//	System.out.println(car);
//	System.out.println(bus);
//	if(bus==null)
//		bus.stop();
//}
//}
//<bean id="b1" class="springdemo1.Bus" scope="prototype" lazy-init="false"></bean>
//<bean id="c1" class="springdemo1.Car" scope="prototype" lazy-init="true"></bean>
//BUs object got created
//init method is called a start method
//Car object got created
//springdemo1.Car@2d1ef81a
//springdemo1.Bus@4c402120


//public class Tester2 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Bus bus=(Bus) applicationContext.getBean("b1");
//	Car car=(Car) applicationContext.getBean("c1");
//	System.out.println(car);
//	System.out.println(bus);
//}
//}
//<bean id="b1" class="springdemo1.Bus" scope="prototype" lazy-init="false" init-method="start" destroy-method="stop"></bean>
//<bean id="c1" class="springdemo1.Car" scope="prototype" lazy-init="true"></bean>
//BUs object got created
//init method is called a start method
//Car object got created
//springdemo1.Car@4c402120
//springdemo1.Bus@327514f


//-----------09/12/2023-------------
//public class Tester2 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Bus bus=(Bus) applicationContext.getBean("b1");
//	Bus bus1=(Bus) applicationContext.getBean("b1");
//	Car car=(Car) applicationContext.getBean("c1");
//	Car car1=(Car) applicationContext.getBean("c1");
//	System.out.println(car);
//	System.out.println(car1);
//	System.out.println(bus);
//	System.out.println(bus1);
//}
//}
//<bean id="b1" class="springdemo1.Bus" lazy-init="false"></bean>
//<bean id="c1" class="springdemo1.Car" lazy-init="true"></bean>
//springdemo1.Car@1573f9fc
//springdemo1.Bus@6150c3ec
//springdemo1.Bus@6150c3ec
//springdemo1.Car@1573f9fc
//springdemo1.Car@1573f9fc
//springdemo1.Bus@6150c3ec
//springdemo1.Bus@6150c3ec

//public class Tester2 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Bus bus=(Bus) applicationContext.getBean("b1");
//	Bus bus1=(Bus) applicationContext.getBean("b1");
//	Car car=(Car) applicationContext.getBean("c1");
//	Car car1=(Car) applicationContext.getBean("c1");
//	System.out.println(car);
//	System.out.println(car1);
//	System.out.println(bus);
//	System.out.println(bus1);
//}
//}
//<bean id="b1" class="springdemo1.Bus" scope="prototype" lazy-init="false"></bean>
//<bean id="c1" class="springdemo1.Car" scope="prototype" lazy-init="true"></bean>
//springdemo1.Car@2d1ef81a
//springdemo1.Car@4c402120
//springdemo1.Bus@327514f
//springdemo1.Bus@5b12b668


//public class Tester2 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Bus bus=(Bus) applicationContext.getBean("b1");
//	Bus bus1=(Bus) applicationContext.getBean("b1");
//	Car car=(Car) applicationContext.getBean("c1");
//	Car car1=(Car) applicationContext.getBean("c1");
//	System.out.println(car);
//	System.out.println(car1);
//	System.out.println(bus);
//	System.out.println(bus1);
//}
//}
//<bean id="b1" class="springdemo1.Bus"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//springdemo1.Car@1573f9fc
//springdemo1.Car@1573f9fc
//springdemo1.Bus@6150c3ec
//springdemo1.Bus@6150c3ec


//public class Tester2{
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//		System.out.println(applicationContext.getBean("c1"));
//	}
//}
//<bean id="b1" class="springdemo1.Bus"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//springdemo1.Car@1573f9fc


//public class Tester2{
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//		Car car= (Car) applicationContext.getBean("c1");
//		System.out.println(car.colour);
//		System.out.println(car.company);
//	}
//}
//public class Car {
//	String colour="Black";
//	String company="BMW";
//}
//<bean id="b1" class="springdemo1.Bus"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//output:-Black
//BMW


//public class Tester2{
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Car car= (Car) applicationContext.getBean("c1");
//	System.out.println(car.colour);
//	System.out.println(car.company);
//}
//}
//public class Car {
//String colour;
//String company;
//}
//<bean id="b1" class="springdemo1.Bus"></bean>
//<bean id="c1" class="springdemo1.Car"></bean>
//output:-
//null
//null


//public class Tester2{
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Car car= (Car) applicationContext.getBean("c1");
//	System.out.println(car.colour);
//	System.out.println(car.company);
//}
//}
//public class Car {
//	String colour;
//	String company;
//	public void setColour(String colour) {
//		this.colour = colour;
//	}
//	public void setCompany(String company) {
//		this.company = company;
//	}
//}
//null
//null


//public class Tester2{
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Car car= (Car) applicationContext.getBean("c1");
//	car.setColour("red");
//	car.setCompany("audi");
//	System.out.println(car.colour);
//	System.out.println(car.company);
//}
//}
//public class Car {
//	String colour;
//	String company;
//	public void setColour(String colour) {
//		this.colour = colour;
//	}
//	public void setCompany(String company) {
//		this.company = company;
//	}
//}
//red
//audi


//public class Tester2{
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Car car= (Car) applicationContext.getBean("c1");
//	System.out.println(car.colour);
//	System.out.println(car.company);
//}
//}
//public class Car {
//	String colour;
//	String company;
//	public void setColour(String colour) {
//		this.colour = colour;
//	}
//	public void setCompany(String company) {
//		this.company = company;
//	}
//}
//<bean id="b1" class="springdemo1.Bus"></bean>
//<bean id="c1" class="springdemo1.Car">
//	<property name="colour" value="green"></property>
//	<property name="company" value="toyota_motors"></property>
//</bean>
//output:-
//green
//toyota_motors


//public class Tester2{
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
//	Car car= (Car) applicationContext.getBean("c1");
//	Bus bus=applicationContext.getBean(Bus.class);//for classtype there is no need to typecast
//	System.out.println(bus.colour);
//	System.out.println(bus.company);
//}
//}
//public class Bus{
//	String colour;
//	String company;
//	public Bus(String colour,String company) {
//		// TODO Auto-generated constructor stub
//		this.colour=colour;
//		this.company=company;
//	}
//}
//<bean id="b1" class="springdemo1.Bus">
//	<constructor-arg value="white"></constructor-arg>
//	<constructor-arg value="airavat"></constructor-arg>
//</bean>
//<bean id="c1" class="springdemo1.Car">
//	<property name="colour" value="green"></property>
//	<property name="company" value="toyota_motors"></property>
//</bean>
//output:-
//white
//airavat


public class Tester2{
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springdemo1/newFile.xml");
		System.out.println(applicationContext.getBean("c1"));
		System.out.println(applicationContext.getBean("b1"));
	}
}