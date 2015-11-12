import java.awt.Color;

public class Circle extends Shape implements GeometricableObject {

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
	public void remove() {

			System.out.println("Circle was removed from the drawing");
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle with radius: " + radius);
		
	}

	@Override
	public void resize(int percent) {
		radius *= percent * 1.0/100;
		
		
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle c = (Circle) obj;
			if (this.area() == c.area() && this.perimeter() == c.perimeter())
				return true;
		}
		return false;
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
		System.out.println("Moving the circle up");
	}

	@Override
	public void moveDown() {
		System.out.println("Moving the circle down");
	}

	@Override
	public void moveLeft() {
		System.out.println("Moving the circle left");
	}

	@Override
	public void moveRight() {
		System.out.println("Moving the circle right");
	}
}
