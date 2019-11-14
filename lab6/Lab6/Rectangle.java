
public class Rectangle extends Shape 
{
	private double width;
	private double length;

	// CONSTRUCTORS
	public Rectangle() {
		super(); // no-arg constructor of shape class.
		this.width = 1.0;
		this.length = 1.0;
	}

	public Rectangle(double width, double length) {
		super(); // no-arg constructor of shape class.
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	// GETTER-SETTER
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return this.length * this.width;
	}

	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}

	@Override
	public String toString() {
		return "A Rectangle with width=" + this.width + " and length=" + length + " which is a subclass of "
				+ super.toString();
	}

}
