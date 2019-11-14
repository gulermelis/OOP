
public class Circle extends Shape 
{
	private double radius;

	// CONSTRUCTORS
	public Circle() {
		super(); // shape superclass'ındaki boş constructor'ı çağırır.
		this.radius = 1.0; // default value.
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// GETTER-SETTER
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// FUNCTIONS
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public String toString() {
		return "A Circle with radius=" + this.radius + " which is a subclass of " + super.toString();
	}

}
