package springdemo1;

//public class Car {
////	public Car() {
////		System.out.println("Car object got created");
////	}
//	String colour="Black";
//	String company="BMW";
//}


//------------09-12-2023-----------
//public class Car {
//	String colour;
//	String company;
//	public void setColour(String colour) {
//		this.colour = colour;
//	}
//	public void setCompany(String company) {
//		this.company = company;
//	}
//}


public class Car{
//	SonyMusicSystem musicSystem=new SonyMusicSystem();//the problem here is tightly coupled.
	MusicSystem musicSystem;

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	@Override
	public String toString() {
		return "Car [musicSystem=" + musicSystem + "]";
	}
	
}
