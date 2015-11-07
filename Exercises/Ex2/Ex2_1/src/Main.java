


public class Main {

	public static void main(String[] args) {
		IShape [] shapes = new Shape[3];
		shapes[0] = new Rectangle(10,20,"Rect1");
		shapes[1] = new Circle("Circle1",10);
		shapes[2] = new Line("Line1", new Point(5,0));
		
		for(IShape shape:shapes)
		{
			System.out.println("Shape name: " + shape.getName());
			shape.draw();
			System.out.println("Area is: " + shape.area());
			System.out.println("Perimeter is: " + shape.perimeter());
			shape.remove();
			System.out.println("----------------------------");
		}
			
	}

}
