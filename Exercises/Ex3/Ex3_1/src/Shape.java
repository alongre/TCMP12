import java.awt.Color;

public abstract class Shape implements Moveable
{
	protected Point position;
	protected Color color;
	protected boolean fill;

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
	 * @param position
	 * @param c
	 * @param fill
	 */
	public Shape(Point position, Color c, boolean fill,String name) {
		this.position = position;
		this.color = c;
		this.fill = fill;
	}
	/**
	 * 
	 */
	public Shape(String name) {
		this.position = new Point(0,0);
		this.color = Color.blue;
		fill = false;
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
	public abstract void remove();
	
	public abstract void draw();
	public abstract void resize(int percent);
	@Override
	public abstract boolean equals(Object obj);

}
