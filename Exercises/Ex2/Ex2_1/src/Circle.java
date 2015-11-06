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

	public Circle(String name)
	{
		super(name);
		radius = 5;
	}

	
	public Circle(Point position, Color color, boolean fill,String name)
	{
		super(position,color , fill, name);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
		
	}

	@Override
	public void resize(int percent) {
		radius *= percent/100;
		
	}

	

	@Override
	public boolean isEqual(IShape shape) {
		Circle circle = (Circle)shape;
		if (this.radius != circle.radius) return false;
		if (this.perimeter() != circle.perimeter()) return false;
		if (this.area() != circle.area()) return false;
		return true;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);

	}

	@Override
	public double perimeter() {
		
		return 2*Math.PI*radius;
	}
	
	
	
	
}
