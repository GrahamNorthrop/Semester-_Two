import java.util.*;
public class Pyramid {
	static Scanner input = new Scanner(System.in);
	private float l = 0;
	private float w = 0;
	private float h = 0;
	
	void setLength() {
		float l1;
		System.out.println("Enter Length of the Pyramid: ");
		l1 = input.nextFloat();
		l = l1;
	}
	
	void setWidth() {
		float w1;
		System.out.println("Enter Width of the Pyramid: ");
		w1 = input.nextFloat();
		w = w1;
	}
	
	void setHeight() {
		float h1;
		System.out.println("Enter Height of the Pyramid: ");
		h1 = input.nextFloat();
		h = h1;
	}
	
	float getVolume() {
		float v = 0;
		v = (l*w*h)/3;
		return v;
	}
	
	float getSurfaceArea() {
		float s = 0;
		s = (float) (l*w + l*Math.sqrt((w/2)*(w/2) + (h*h)) + w*Math.sqrt((l/2)*(l/2) + (h*h)));
		return s;
	}
}