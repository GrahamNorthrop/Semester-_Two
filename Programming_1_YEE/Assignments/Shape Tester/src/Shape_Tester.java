import java.util.*;
public class Shape_Tester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values for the dimensions of a box: ");
		Box box = new Box();
		box.setWidth();
		box.setHeight();
		box.setLength();
		System.out.println("Volume of the Box is " + box.getVolume());
		System.out.println("Surface Area of the Box is " + box.getSurfaceArea());
		
		System.out.println("Enter the values for the dimensions of a Sphere: ");
		Sphere sphere = new Sphere();
		sphere.setRadius();
		System.out.println("Volume of the Sphere is " + sphere.getVolume());
		System.out.println("Surface Area of the Sphere is " + sphere.getSurfaceArea());
		
		System.out.println("Enter the values for the dimensions of a Pyramid: ");
		Pyramid pyramid = new Pyramid();
		pyramid.setWidth();
		pyramid.setHeight();
		pyramid.setLength();
		System.out.println("Volume of the Pyramid is " + pyramid.getVolume());
		System.out.println("Surface Area of the Pyramid is " + pyramid.getSurfaceArea());
	}

}