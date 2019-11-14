
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle=new Circle();
		System.out.println(circle.getArea());
		
		Rectangle rectangle=new Rectangle(3,4);
		System.out.println(rectangle.getArea());
		
		Square square=new Square(5);
		System.out.println(square.getArea());
		
		Shape[] s = new Shape[3];
		s[0] = circle;
		s[1] = rectangle;
		s[2] = square;

	}

}
