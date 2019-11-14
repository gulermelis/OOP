package _Lab4;

public class TestCylinder {

	public static void main(String[] args) 
	{
	
		Cylinder c1 = new Cylinder();
		
		System.out.println(c1);
		

		Cylinder c2 = new Cylinder(2.0);
		System.out.println(c2.getVolume());
		
		Cylinder c3 = new Cylinder(3.0, "blue", 5.0);
		
		System.out.println(c3.getArea());
		
	}

}
