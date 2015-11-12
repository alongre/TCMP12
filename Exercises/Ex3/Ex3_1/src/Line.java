import java.awt.Color;

public class Line extends Shape {

	private Point endPoint;
	
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
	public boolean equals(Object obj) {
		Line l = (Line) obj;
		if (this.name.compareTo(l.getName())==0 &&  this.position == l.position && this.endPoint == l.endPoint) return true;
		return false;
	}



	@Override
	public void moveUp() {
		System.out.println("Moving " + this.name + " up");
	}

	@Override
	public void moveDown() {
		System.out.println("Moving " + this.name + " down");
	}

	@Override
	public void moveLeft() {
		System.out.println("Moving " + this.name + " left");
	}

	@Override
	public void moveRight() {
		System.out.println("Moving " + this.name + " right");
	}
}
