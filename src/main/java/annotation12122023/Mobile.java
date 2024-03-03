package annotation12122023;

import java.beans.JavaBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//public class Mobile {
//	public Mobile() {
//		System.out.println("mobile object created");
//	}
//}
@Lazy
@Component()
public class Mobile {
	public Mobile() {
		System.out.println("mobile object created");
	}
	@Value("samsung")
	String brand;
	@Value("25000")
	int price;
	String colour;
}
