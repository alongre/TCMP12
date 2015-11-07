import java.awt.Color;


public class Main {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10,20,"Rect1");
		shapes[1] = new Circle(new Point(30,20),Color.blue,false,"Circle1",15);
		shapes[2] = new Line("Line1", new Point(5,0));
		ShapeContainer shapeList = new ShapeContainer(shapes);
		shapeList.add(new Circle(new Point(10,10),Color.red,true,"Circle2",10));
		shapeList.add(new Line("Line2",new Point(30,10)));
		
		shapeList.drawAll();
		shapeList.resizeAll(50);
		System.out.println(shapeList.toString());
		
			
	}

}
