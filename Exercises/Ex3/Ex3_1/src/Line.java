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
	public void remove() {

		System.out.println("Circle was removed from the drawing");
	}

	@Override
	public void draw() {
		System.out.println("Drawing Line");

	}

	@Override
	public void resize(int percent) {
		System.out.println("Resizing the Line by " + percent + "%");
		
		

	}

	@Override
	public boolean equals(Object obj) {
		Line l = (Line) obj;
		if (this.position == l.position && this.endPoint == l.endPoint) return true;
		return false;
	}



	@Override
	public void moveUp() {
		System.out.println("Moving the line up");
	}

	@Override
	public void moveDown() {
		System.out.println("Moving the line down");
	}

	@Override
	public void moveLeft() {
		System.out.println("Moving the line left");
	}

	@Override
	public void moveRight() {
		System.out.println("Moving the line right");
	}
}
