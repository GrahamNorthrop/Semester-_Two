import java.util.Scanner;

public class Vehicles {
	private float  miles, hours, speed;
	static Scanner input = new Scanner(System.in);
	public void setMiles() {
		float m;
		System.out.println("Input the Distance Traveled by the Car in Miles: ");
		m = input.nextFloat();
		miles = m;
	}
	public void setTime() {
		float t;
		System.out.println("Input the Time in Hours: ");
		t = input.nextFloat();
		hours = t;
	}
	public float calculations() {
		speed = miles/hours;
		return speed;
	}
	
	public void setMiles1() {
		float m1;
		System.out.println("Input the Distance Traveled by the Bike in Miles: ");
		m1 = input.nextFloat();
		miles = m1;
	}
	public void setTime1() {
		float t1;
		System.out.println("Input the Time in Hours: ");
		t1 = input.nextFloat();
		hours = t1;
	}
}