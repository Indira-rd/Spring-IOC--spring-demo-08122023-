package task_13122023;

import org.springframework.stereotype.Component;

@Component
public class Chocolate implements IceCream{

	public void flavour() {
		System.out.println("Chocolate flavour");
	}
	
}
