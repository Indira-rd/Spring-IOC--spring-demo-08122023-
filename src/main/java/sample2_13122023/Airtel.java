package sample2_13122023;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("air")
//public class Airtel {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}


//@Component("air")
//public class Airtel implements Sim {
//	double chargePrice;
//
//	@Override
//	public String toString() {
//		return "Airtel [chargePrice=" + chargePrice + "]";
//	}
//}


@Primary
@Component("air")
public class Airtel implements Sim {
	double chargePrice;

	@Override
	public String toString() {
		return "Airtel [chargePrice=" + chargePrice + "]";
	}
}