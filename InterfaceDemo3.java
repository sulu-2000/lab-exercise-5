package smweek4;

public class InterfaceDemo3 {

	public static void main(String[] args) {
		Student student=()->{
			System.out.println("learning method logic...");
		};
		student.learn();
		
		Driver driver=(String... s)->{
			System.out.println("driver logic is...");
			System.out.println("the value supplied is..."+s);
		};
		driver.drive("the light machine...");
		
		Pilot pilot=(name,speed)->{
			System.out.println("pilot name is called..."+name);
			System.out.println("the speed is.."+speed);
		};
		pilot.fly("karthik",1000);
	}

}
interface Student{
	public void learn();
}
interface Driver{
	public void drive(String...s);
}
interface Pilot{
	public void fly(String name,int speed);
}