import java.awt.Color;

public abstract class Shape 
{
	protected Point position;
	protected Color color;
	protected boolean fill;
	/**
	 * @param c the c to set
	 */
	public void setC(Color c) {
		this.color = c;
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
	 * @param position
	 * @param c
	 * @param fill
	 */
	public Shape(Point position, Color c, boolean fill) {
		this.position = position;
		this.color = c;
		this.fill = fill;
	}
	/**
	 * 
	 */
	public Shape() {
		this.position = new Point(0,0);
		this.color = Color.blue;
		fill = false;
	}
	
	public abstract void draw();
	public abstract void resize();
	public abstract void move();
	public abstract void remove();
	
	
	
}
