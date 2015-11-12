import java.awt.Color;


public class Main {

	public static void main(String[] args) {
		GeometricableObject rectangle = new Rectangle(10,20,"Rect1");
		GeometricableObject circle = new Circle(new Point(30,20),Color.blue,false,"Circle1",15);
		Shape line = new Line("Line1", new Point(5,0));
		
		ShapeContainer shapeList = new ShapeContainer(5);
		shapeList.add(rectangle);
		shapeList.add(circle);
		shapeList.add(line);
		System.out.println("Shape List");
		System.out.println(shapeList.toString());
		
		
		shapeList.drawAll();
		shapeList.move(direction.Right);
		System.out.println("Total area: " + shapeList.areaOfAll(new GeometricableObject[]{rectangle,circle}));
	}

}
