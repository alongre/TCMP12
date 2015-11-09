import java.awt.Color;

public class Line extends Shape {

	private Point endPoint;;
	
	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	
	public Line(Point startPoint, Color c, boolean fill, String name,Point endPoint) {
		super(startPoint, c, fill, name);
		this.endPoint = endPoint;
	}
	public Line(String name,Point endPoint)
	{
		super(new Point(0,0),Color.green,true,name);
		this.endPoint = endPoint;
	}
	public double length()
	{
		double startX = position.getX();
		double startY = position.getY();
		double endX = endPoint.getX();
		double endY = endPoint.getY();
		return Math.sqrt(Math.pow((endX - startX),2) + Math.pow((endY-startY),2));
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Line " + this.name);

	}

	@Override
	public void resize(int percent) {
		super.resize(percent);
		
		

	}
	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	

}
