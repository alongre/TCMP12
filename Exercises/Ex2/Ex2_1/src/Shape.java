import java.awt.Color;

public abstract class Shape implements IShape
{
	protected Point position;
	protected Color color;
	protected boolean fill;
	protected String name;
	/**
	 * @param c the c to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @return the fill
	 */
	public boolean isFill() {
		return fill;
	}
	/**
	 * @param fill the fill to set
	 */
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	
	
	/**
	 * @return the position
	 */
	public Point getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(Point position) {
		this.position = position;
	}
	/**
	 * @return the c
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param position
	 * @param c
	 * @param fill
	 */
	public Shape(Point position, Color c, boolean fill,String name) {
		this.position = position;
		this.color = c;
		this.fill = fill;
		this.name = name;
	}
	/**
	 * 
	 */
	public Shape(String name) {
		this.position = new Point(0,0);
		this.color = Color.blue;
		fill = false;
		this.name = name;
	}
	public final void move(Point p)
	{
		position = p;
	}
	public final void move(int x,int y)
	{
		position.setX(x);
		position.setY(y);
		
	}
	public final void remove()
	{
		System.out.println(name + " was removed from the drawing");
	}
	
	public abstract void draw();
	public abstract void resize(int percent);
	public abstract boolean isEqual(IShape shape);
	public abstract double area();
	public abstract double perimeter();
	
}
