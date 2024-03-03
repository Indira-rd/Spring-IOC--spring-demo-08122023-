package springdemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//public class Tester1 {
//	public static void main(String[] args) {
//		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
//		Car car=(Car) beanFactory.getBean("c1");
//		Bus bus=(Bus) beanFactory.getBean("b1");
//		System.out.println(car);
//		System.out.println(bus);
//	}
//}
//output:- 
//springdemo1.Car@124c278f
//springdemo1.Bus@15b204a1

//the following output i am getting when i created the constructor for car and bus class
//output:-
//Car object got created
//BUs object got created
//springdemo1.Car@124c278f
//springdemo1.Bus@15b204a1

//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//<bean id="b1" class="springdemo1.Bus"></bean>


//public class Tester1 {
//	public static void main(String[] args) {
//		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
//		Car car=(Car) beanFactory.getBean("c1");
//		Bus bus=(Bus) beanFactory.getBean("b1");
//	}
//}
//output:-
//Car object got created
//BUs object got created
//
//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//<bean id="b1" class="springdemo1.Bus"></bean>


//public class Tester1 {
//	public static void main(String[] args) {
//		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
//		
//		Bus bus=(Bus) beanFactory.getBean("b1");
//		Car car=(Car) beanFactory.getBean("c1");
//	}
//}


public class Tester1 {
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
	}
}
//output:-blank
