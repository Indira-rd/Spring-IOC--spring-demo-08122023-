package springdemo1;

//public class Bus {
////	public Bus() {
////		System.out.println("BUs object got created");
////	}
////	public void start() {
////		System.out.println("init method is called a start method");
////	}
////	public void stop() {
////		System.out.println("destroy method is called a stop method");
////	}
//}

//--------09/12/2023------------------

//public class Bus{
//	String colour;
//	String company;
//	public Bus(String colour,String company) {
//		// TODO Auto-generated constructor stub
//		this.colour=colour;
//		this.company=company;
//	}
//}


public class Bus{
	 Engine engine;
	 public Bus(Engine engine) {
		this.engine=engine;
	}
	@Override
	public String toString() {
		return "Bus [engine=" + engine + "]";
	}
}
