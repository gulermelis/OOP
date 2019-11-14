
public abstract class Shape {
	
	private String color;
	private boolean filled;

	// CONSTRUCTORS
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public Shape() {
		this.color = "red";
		this.filled = true;
	}

	// GETTERS-SETTERS
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	@Override
	public String toString() {
		if(this.filled)
		return "A Shape with color of " + this.color + " and filled.";
		else
			return "A Shape with color of " + this.color + " and Not Filled.";
	}

}
