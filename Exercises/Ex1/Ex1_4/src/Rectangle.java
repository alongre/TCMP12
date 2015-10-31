import java.awt.Point;

public class Rectangle {

	private int x = 0;
	private int y = 0;
	private int height = 0;
	private int width = 0;
	
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

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
	 * @param x
	 * @param y
	 * @param length
	 * @param width
	 */
	public Rectangle(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	
	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	
	
	public int area()
	{
		return height * width;
	}
	
	public int perimeter()
	{
		return height*2 +  width*2;
	}
	public void resize(int percent)
	{
		double p = percent * 1.0 / 100;
		
		//double mult = percent/100;
		
		height*= p;
		width*= p;
	}
	public void resize(int w,int h)
	{
		width = w;
		height = h;
	}

	public boolean isEqual(Rectangle r)
	{
		if (this.area() == r.area()) return true;
		return false;
	}
	public void move(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public void move(Point p)
	{
		if (p==null) return;
		this.x = p.x;
		this.y = p.y;
	}
	
	public Rectangle Union(Rectangle r)
	{
		if (r == null) return this;
		int xLeft = Math.min(this.x, r.x);
		int yBottom = Math.min(this.y, r.y);
		int xRight = Math.max(this.x + this.width, r.x + r.width);
		int yTop = Math.max(this.y + height, r.y + r.height);
		return new Rectangle(xLeft,yBottom,yTop - yBottom,xRight - xLeft);
	}
	public boolean isIntersect(Rectangle r)
	{
		if (x+width < r.x || r.x+r.width < x || y+height < r.y || r.y+r.height<y)
			return false;
		return true;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", height=" + height + ", width=" + width + "]";
	}
	
}
