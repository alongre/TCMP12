import java.awt.Color;


public class Main {

	public static void main(String[] args) {
		Shape shape1 = new Rectangle(10,20,"Rect1");
		Shape shape2 = new Circle(new Point(30,20),Color.blue,false,"Circle1",15);
		Shape shape3 = new Line("Line1", new Point(5,0));
		
		ShapeContainer shapeList = new ShapeContainer(5);
		shapeList.add(shape1);
		shapeList.add(shape2);
		shapeList.add(shape3);
		System.out.println("Shape List");
		
		System.out.println(shapeList.toString());
		
		
		shapeList.drawAll();
		shapeList.resizeAll(50);
		System.out.println("After resize");
		System.out.println(shapeList.toString());
		System.out.println("Removing index 1");
		shapeList.remove(1);
		System.out.println(shapeList.toString());
		
			
	}

}
