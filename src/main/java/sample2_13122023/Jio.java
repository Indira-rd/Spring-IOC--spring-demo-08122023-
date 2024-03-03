package sample2_13122023;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//public class Jio {
//
//	@Override
//	public String toString() {
//		return "Jio []";
//	}
//}


//public class Jio implements Sim{
//
//	@Override
//	public String toString() {
//		return "JioSimObject";
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


@Primary
@Component
public class Jio implements Sim{

	@Override
	public String toString() {
		return "JioSimObject";
	}
}