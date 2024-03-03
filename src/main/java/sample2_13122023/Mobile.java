package sample2_13122023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
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


@Component("mob")
public class Mobile {
	@Qualifier("jio")
	@Autowired
	Sim sim;
	@Autowired
	Wifi wifi;
	@Value("24000")
	double prize;
	String name;
	@Override
	public String toString() {
		return "Mobile [sim=" + sim + ", prize=" + prize + ", name=" + name + "]";
	}
}
