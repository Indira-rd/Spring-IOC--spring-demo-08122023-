package task_13122023;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Strawberry implements IceCream{

	public void flavour() {
		System.out.println("Strawberry flavour");
	}

}
