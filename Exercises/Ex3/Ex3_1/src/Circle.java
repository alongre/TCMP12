import java.awt.Color;

public class Circle extends Shape {

	private double radius;
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(String name,double radius)
	{
		super(name);
		this.radius = radius;
	}

	
	public Circle(Point position, Color color, boolean fill,String name,double radius)
	{
		super(position,color , fill, name);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a circle with radius: " + radius);
		
	}

	@Override
	public void resize(int percent) {
		super.resize(percent);
		radius *= percent * 1.0/100;
		
		
	}
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);

	}

	@Override
	public double perimeter() {
		
		return 2*Math.PI*radius;
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
