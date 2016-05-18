import java.util.*;
public class Box {
	static Scanner input = new Scanner(System.in);
	private float l = 0;
	private float w = 0;
	private float h = 0;
	
	void setLength() {
		float l1;
		System.out.println("Enter Length of the Box: ");
		l1 = input.nextFloat();
		l = l1;
	}
	
	void setWidth() {
		float w1;
		System.out.println("Enter Width of the Box: ");
		w1 = input.nextFloat();
		w = w1;
	}
	
	void setHeight() {
		float h1;
		System.out.println("Enter Height of the Box: ");
		h1 = input.nextFloat();
		h = h1;
	}
	
	float getVolume() {
		float v = 0;
		v = l*w*h;
		return v;
	}
	
	float getSurfaceArea() {
		float s = 0;
		s = 2*l*h + 2*w*h + 2*l*w;
		return s;
	}
}