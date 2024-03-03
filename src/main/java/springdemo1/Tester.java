package springdemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//public class Tester {
//	public static void main(String[] args) {
//		Car c1=new Car();
//		Car c2=new Car();
//		System.out.println(c1);
//		System.out.println(c2);
//	}
//}
//output:-
//springdemo1.Car@626b2d4a
//springdemo1.Car@5e265ba4
//the output will be different. because here we used new keyword. every time when i used new keyword in my memorynew will create a random memory space. it will inject non-static member of Car.
//to avoid this again and again object creation, we want just the same object. this concept is calles as singleton. singleton means object will not be created multiple times, it will be single object.

////we want spring to create object, so that we need to create a container
//public class Tester {
//	public static void main(String[] args) {
//		//here we are creating the bean factory container
//		//by default we wont get bean factory. because it does not belongs to jdk. in spring bean factory is there. org.springframework.beans.factory is the package
//		//we need to go and download spring from maven repository  ->type spring ->1st one ->5.3.18 version
//		//BeanFactory factory=new XmlBeanFactory(null);//BEANfACTORY IS BASICALLY A CONTAINER
//		//WE NEED TO TELL FOR WHICH CLASS we need to create an object by using xml way. now, we need to configure it using xml
//		//i need to create an xml for configurring it. configuring in the sence, setting , telling
//		//we can give any  name to my xml file. because for this factory we are passing the file. In case of persistence, we are not going to pass that persistence file. entitymanagerfactory will automatically find it.
//		//So, this created xml file that is newFile.xml we need to pass into this container. But to make this as a Bean configuration file,it is compulsory to write <beans>tag. bean is optional but beans is compulsory.
//		//after writing beans tag in xml file, it is telling that beans it does not understand. xml will not know what is beans. so, we have to write some declarations of beans.
//		//to get that declaration we have type spring beans xml definition in google browser. then just copy the definition.
//		//this is how we configure a xml file. 
//		//this beans tag is default tag
//		
//		//for bean factory we cannot directly pass the file. we have to create a path of class path resourse
//		ClassPathResource resource=new ClassPathResource("springdemo1/newFile.xml");//we are creating the xml file in inside the package for that reason we need to write packagename/filename. we can create xml file inside the package as well as outside the package that is directly inside the src/main/java also we can create at that time we can pass the path name as just filename.
//		BeanFactory factory=new XmlBeanFactory(resource);
//		//we need to get the object before that we need check whether the container is created or not. to check whether the container is created or not, just run this. if we wont get any error it means container is ready.
//		//now, container is ready. we need to ask the container for object
//		//the method for getting the object is we need to call the method getBean()
//		//getBean also we write it in 2 different ways. 1 is based on the id we can get it. another one is based on the type of class. for example i need Car class object now. so, Car.class
////		System.out.println(factory.getBean(Car.class));
//		//i am getting error called  No qualifying bean of type 'springdemo1.Car' available
//		//container is there but inside this there is no object of Car.
//		//why object is not there inside a container because i did not tell it to create the object. i have created the container and i am asking for the object Car. but i have not telling container to create the object of the Car
//		//to tell it to create i have to write <bean id="some name(any name we can give)" class="here we have to mention fully qualified path. (to copy fully qualified path right click on class name then copy qualified name or we can write packagename.classname)"></bean> we need to write this in inside a beans tag inside xml file... this line basically tells spring to create object
//		//there is a method called getBean that is going to give you the object
//		System.out.println(factory.getBean("c1"));//here i am passing id
//	}
//}
////output:- springdemo1.Car@61dd025


//public class Tester {
//	public static void main(String[] args) {
//		ClassPathResource resource=new ClassPathResource("springdemo1/newFile.xml");//we are creating the xml file in inside the package for that reason we need to write packagename/filename. we can create xml file inside the package as well as outside the package that is directly inside the src/main/java also we can create at that time we can pass the path name as just filename.
//		BeanFactory factory=new XmlBeanFactory(resource);
////		Car car = factory.getBean("c1");
////		System.out.println(car);//Here i am not getting a output. i am getting a error like Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		//Type mismatch: cannot convert from Object to Car
//		//to get the object of bus i need to write bean for bus in xml newFile.xml file
////		Bus bus=factory.getBean("b1");
////		System.out.println(bus);
//		//can same method have 2 different datatypes? ans:- It is possible in the case of method overloading. but here arguments also same string type. we can't overload the method here. 
//		//there are 2 methods getBean, which is accepting string. one should return Car object. and one should return bus object. this is not possible. So, i need something which is common. So, they have made it upcasted to Object. we have to downcast. THEY HAVE upcasted each and every class for an object. that is each and every class is inheriting from the object. what they made is they have upcasted every class to object. so the written type of getBean they have made it as object. SO, we need to just downcast. downcast should be done explicitely as shown in below.
//		Car car = (Car) factory.getBean("c1");
//		System.out.println(car);
//		Bus bus=(Bus) factory.getBean("b1");
//		System.out.println(bus);
//	}
//}
////output:-
////springdemo1.Car@61dd025
////springdemo1.Bus@15b204a1


//public class Tester {
//	public static void main(String[] args) {
//		//---- actually dont know the code-------
//		Car car1=new Car("c1");
//		Car car2=new Car("c1");
//		System.out.println(car1);
//		System.out.println(car2);
//		//here i am getting the error as Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//		//The constructor Car(String) is undefined
//		//The constructor Car(String) is undefined
//	}
//}
////when the classCastException comes? ans: because the object it has created is of Car. and Car has been upcasted to Object. but you are trying to downcast Object to Bus. the object from the Bus is not upcasted till now. so, if you don't upcaste try to downcast without upcasting you will get ClassCastException.
////the returntype of getBean is object. you need to typecAST it to perticular type.


//public class Tester{
//	public static void main(String[] args) {
//		ClassPathResource resource=new ClassPathResource("springdemo1/newFile.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
//		Bus bus=(Bus) factory.getBean("c1");
//		System.out.println(bus);
//	}
//}
//output:-
//Exception in thread "main" java.lang.ClassCastException: class springdemo1.Car cannot be cast to class springdemo1.Bus (springdemo1.Car and springdemo1.Bus are in unnamed module of loader 'app')
//at springdemo1.Tester.main(Tester.java:99)


//public class Tester{
//	public static void main(String[] args) {
//		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
//		//here i am deleting bean of Bus
//		Bus bus=(Bus) beanFactory.getBean("c1");
//		System.out.println(bus);
//	}
//}
//output:-
////Exception in thread "main" java.lang.ClassCastException: class springdemo1.Car cannot be cast to class springdemo1.Bus (springdemo1.Car and springdemo1.Bus are in unnamed module of loader 'app')
////at springdemo1.Tester.main(Tester.java:113)


//public class Tester {
//	public static void main(String[] args) {
//---------actually don't know the question---------
//		Car car1=new Car();
//		Car car2=new Car();
//		System.out.println(car1);
//		System.out.println(car2);
//	}
//}
////output:-
////springdemo1.Car@626b2d4a
////springdemo1.Car@5e265ba4


//public class Tester {
//	public static void main(String[] args) {
////		--------actually i don't know the question-----------
//	ClassPathResource resource=new ClassPathResource("springdemo1/newFile.xml");//we are creating the xml file in inside the package for that reason we need to write packagename/filename. we can create xml file inside the package as well as outside the package that is directly inside the src/main/java also we can create at that time we can pass the path name as just filename.
//	BeanFactory factory=new XmlBeanFactory(resource);
//	System.out.println(factory.getBean("c1"));
//	System.out.println(factory.getBean("c1"));
//	}
//}
////output:-
////springdemo1.Car@61dd025
////springdemo1.Car@61dd025


//public class Tester {
//	public static void main(String[] args) {
//	ClassPathResource resource=new ClassPathResource("springdemo1/newFile.xml");//we are creating the xml file in inside the package for that reason we need to write packagename/filename. we can create xml file inside the package as well as outside the package that is directly inside the src/main/java also we can create at that time we can pass the path name as just filename.
//	BeanFactory factory=new XmlBeanFactory(resource);
//	Car car1=(Car) factory.getBean("c1");
//	Car car2=(Car) factory.getBean("c1");
//	System.out.println(car1);
//	System.out.println(car2);
//	}
//}
//output:-
//springdemo1.Car@61dd025
//springdemo1.Car@61dd025

//spring will by defaultly create singleton. it will not create object everytime


//public class Tester {
//	public static void main(String[] args) {
//	ClassPathResource resource=new ClassPathResource("springdemo1/newFile.xml");//we are creating the xml file in inside the package for that reason we need to write packagename/filename. we can create xml file inside the package as well as outside the package that is directly inside the src/main/java also we can create at that time we can pass the path name as just filename.
//	BeanFactory factory=new XmlBeanFactory(resource);
//	Car car=(Car) factory.getBean("c1");
//	System.out.println(car);
//	}
//}
////output:- springdemo1.Car@61dd025


//public class Tester {
//	public static void main(String[] args) {
//	ClassPathResource resource=new ClassPathResource("springdemo1/newFile.xml");//we are creating the xml file in inside the package for that reason we need to write packagename/filename. we can create xml file inside the package as well as outside the package that is directly inside the src/main/java also we can create at that time we can pass the path name as just filename.
//	BeanFactory factory=new XmlBeanFactory(resource);
//	Car car1=(Car) factory.getBean("c1");
//	Car car2=(Car) factory.getBean("c1");
//	System.out.println(car1);
//	System.out.println(car2);
//	}
//}
////<bean id="c1" class="springdemo1.Car" scope="singleton"></bean>
////output:-
//springdemo1.Car@61dd025
//springdemo1.Car@61dd025


//public class Tester {
//	public static void main(String[] args) {
//	ClassPathResource resource=new ClassPathResource("springdemo1/newFile.xml");//we are creating the xml file in inside the package for that reason we need to write packagename/filename. we can create xml file inside the package as well as outside the package that is directly inside the src/main/java also we can create at that time we can pass the path name as just filename.
//	BeanFactory factory=new XmlBeanFactory(resource);
//	Car car1=(Car) factory.getBean("c1");
//	Car car2=(Car) factory.getBean("c1");
//	System.out.println(car1);
//	System.out.println(car2);
//	}
//}
//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//output:-
//springdemo1.Car@d706f19
//springdemo1.Car@30b7c004


//public class Tester{
//	public static void main(String[] args) {
//		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
//		System.out.println("Bus scope is "+beanFactory.isPrototype("bus"));
//		System.out.println("Bus scope is "+beanFactory.isPrototype(Bus.class));
//		System.out.println("Bus scope is "+beanFactory.isSingleton("bus"));
//		System.out.println("Bus scope is "+beanFactory.isSingleton(Bus.class));
//		System.out.println("Car scope is "+beanFactory.isPrototype("car"));
//		System.out.println("Car scope is "+beanFactory.isPrototype(Car.class));
//		System.out.println("Car scope is "+beanFactory.isSingleton("car"));
//		System.out.println("Car scope is "+beanFactory.isSingleton(Car.class));
//	}
//}
//output:-error because only we shoulld pass id as an argument for the isPrototype and isSingleton method we can't pass class type as an argument for these.
//Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//	The method isPrototype(String) in the type BeanFactory is not applicable for the arguments (Class<Bus>)
//	The method isSingleton(String) in the type BeanFactory is not applicable for the arguments (Class<Bus>)
//	The method isPrototype(String) in the type BeanFactory is not applicable for the arguments (Class<Car>)
//	The method isSingleton(String) in the type BeanFactory is not applicable for the arguments (Class<Car>)
//
//	at springdemo1.Tester.main(Tester.java:215)


//public class Tester{
//	public static void main(String[] args) {
//		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
//		System.out.println("Bus scope is "+beanFactory.isPrototype("b1"));
//		System.out.println("Bus scope is "+beanFactory.isSingleton("b1"));
//		System.out.println("Car scope is "+beanFactory.isPrototype("c1"));
//		System.out.println("Car scope is "+beanFactory.isSingleton("c1"));
//	}
//}
//this isSingleton and isPrototype will only take id as an argument. we cannot pass classtype for this as an argument
//output:-
//Bus scope is false
//Bus scope is true
//Car scope is true
//Car scope is false
//
//<bean id="c1" class="springdemo1.Car" scope="prototype"></bean>
//<bean id="b1" class="springdemo1.Bus"></bean>


//public class Tester{
//	public static void main(String[] args) {
//		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
//		System.out.println(beanFactory.getType("c1"));
//		System.out.println(beanFactory.getType("b1"));
//		System.out.println(beanFactory.getType("a1"));
//	}
//}
//this getType() will only take id as an argument. we cannot pass classtype for this as an argument
//output:-
//class springdemo1.Car
//class springdemo1.Bus
//Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'a1' available
//at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanDefinition(DefaultListableBeanFactory.java:872)
//at org.springframework.beans.factory.support.AbstractBeanFactory.getMergedLocalBeanDefinition(AbstractBeanFactory.java:1344)
//at org.springframework.beans.factory.support.AbstractBeanFactory.getType(AbstractBeanFactory.java:709)
//at org.springframework.beans.factory.support.AbstractBeanFactory.getType(AbstractBeanFactory.java:683)
//at springdemo1.Tester.main(Tester.java:262)



//public class Tester{
//	public static void main(String[] args) {
//		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
//		System.out.println(beanFactory.containsBean("c1"));
//		System.out.println(beanFactory.containsBean("B1"));
//		System.out.println(beanFactory.containsBean("b1"));
//		System.out.println(beanFactory.containsBean("a1"));
//	}
//}
//this containsBean() will only take id as an argument. we cannot pass classtype for this as an argument
//output:-
//true
//false
//true
//false


public class Tester{
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("springdemo1/newFile.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		System.out.println(beanFactory.isTypeMatch("b1",Bus.class));
		System.out.println(beanFactory.isTypeMatch("b1",Car.class));
		System.out.println(beanFactory.isTypeMatch("a1",Bus.class));
	}
}
//output:-
//true
//false
//Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'a1' available
//	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanDefinition(DefaultListableBeanFactory.java:872)
//	at org.springframework.beans.factory.support.AbstractBeanFactory.getMergedLocalBeanDefinition(AbstractBeanFactory.java:1344)
//	at org.springframework.beans.factory.support.AbstractBeanFactory.isTypeMatch(AbstractBeanFactory.java:593)
//	at org.springframework.beans.factory.support.AbstractBeanFactory.isTypeMatch(AbstractBeanFactory.java:517)
//	at org.springframework.beans.factory.support.AbstractBeanFactory.isTypeMatch(AbstractBeanFactory.java:677)
//	at springdemo1.Tester.main(Tester.java:302)


//public class Tester {
//public static void main(String[] args) {
//ClassPathResource resource=new ClassPathResource("springdemo1/newFile.xml");//we are creating the xml file in inside the package for that reason we need to write packagename/filename. we can create xml file inside the package as well as outside the package that is directly inside the src/main/java also we can create at that time we can pass the path name as just filename.
//BeanFactory factory=new XmlBeanFactory(resource);
//Car car1=(Car) factory.getBean("c1");
//Car car2=(Car) factory.getBean("c1");
////if(car1==car2)
//if(car1.equals(car2))
//	System.out.println("this is Singleton");
//else
//	System.out.println("this is prototype");
//}
//}
//output:- this is prototype






