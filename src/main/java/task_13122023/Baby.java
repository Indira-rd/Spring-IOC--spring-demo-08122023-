package task_13122023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	@Autowired
	IceCream cream;
	void eat() {
		System.out.print("Baby is eating icecream of ");
		cream.flavour();
	}
}
