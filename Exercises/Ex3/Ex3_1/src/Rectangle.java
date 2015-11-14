import java.awt.Color;

public class Rectangle extends Shape implements GeometricableObject {

	private int height = 0;
	private int width = 0;
	
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param  the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 
	 * @param length
	 * @param width
	 */
	public Rectangle(Point point,Color color,boolean fill,String name,int height, int width) {
		super(point,color, fill, name);
		this.height = height;
		this.width = width;
	}
	public Rectangle(String name)
	{
		super(name);
	}

	@Override
	public void remove() {

	}

	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(int height, int width,String name) {
		super(new Point(0,0),Color.red, false, name);
		this.height = height;
		this.width = width;
	}
	
	public void resize(int w,int h)
	{
		width = w;
		height = h;
	}
	
	public Rectangle Union(Rectangle r)
	{
		if (r == null) return this;
		int xLeft = (int) Math.min(position.getX(), r.position.getX());
		int yBottom = (int) Math.min(position.getY(), r.position.getY());
		int xRight = (int) Math.max(position.getX() + this.width, r.position.getX() + r.width);
		int yTop = (int) Math.max(position.getY() + height, r.position.getY() + r.height);
		return new Rectangle(new Point(xLeft,yBottom),color,fill,"Union", yTop - yBottom,xRight - xLeft);
	}
	public boolean isIntersect(Rectangle r)
	{
		double x = position.getX();
		double y = position.getY();
		double rx = r.position.getX();
		double ry = r.position.getY();
		if (x+width < rx || rx+r.width < x || y+height < ry || ry+r.height<y)
			return false;
		return true;
		
	}

	
	@Override
	public String toString() {
		return "Rectangle [x=" + position.getX() + ", y=" + position.getY() + ", height=" + height + ", width=" + width + "]";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
		
	}
	@Override
	public void resize(int percent)
	{
		double p = percent * 1.0 / 100;
		height*= p;
		width*= p;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			if (this.area() == r.area() && this.perimeter() == r.perimeter())
				return true;
		}
		return false;
	}

	@Override
	public double area()
	{
		return height * width;
	}
	@Override
	public double perimeter()
	{
		return height*2 +  width*2;
	}


	@Override
	public void moveUp() {
		System.out.println("Moving the rectangle up");
	}

	@Override
	public void moveDown() {
		System.out.println("Moving the rectangle down");
	}

	@Override
	public void moveLeft() {
		System.out.println("Moving the rectangle left");
	}

	@Override
	public void moveRight() {
		System.out.println("Moving the rectangle right");
	}
}
