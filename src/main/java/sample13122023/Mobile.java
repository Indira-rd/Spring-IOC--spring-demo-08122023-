package sample13122023;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Mobile {
	public Mobile(double prize, int size) {
		super();
		this.prize = prize;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Mobile [prize=" + prize + ", size=" + size + "]";
	}
	double prize;
	@Value("25000")
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public void setSize(int size) {
		this.size = size;
	}
	int size;

}
//@Component("mob")
//@Scope("prototype")
//public class Mobile {
//	public Mobile(double prize, int size) {
//		super();
//		this.prize = prize;
//		this.size = size;
//	}
//	public Mobile(){
//		
//	}
//	@Override
//	public String toString() {
//		return "Mobile [prize=" + prize + ", size=" + size + "]";
//	}
//	double prize;
//	@Value("25000")
//	public void setPrize(double prize) {
//		this.prize = prize;
//	}
//	public void setSize(int size) {
//		this.size = size;
//	}
//	@Value("8")
//	int size;
//
//}
