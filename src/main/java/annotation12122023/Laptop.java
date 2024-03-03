package annotation12122023;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Laptop {
	public Laptop() {
		System.out.println("laptop object got created");
	}
	@PostConstruct
	void start() {
		System.out.println("postConstruct annotation worked");
	}
	@PreDestroy
	void stop() {
		System.out.println("preDestroy annotation worked");
	}
}
