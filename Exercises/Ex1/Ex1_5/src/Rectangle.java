

public class Rectangle {

	private Point p;
	private int height = 0;
	private int width = 0;
	
	
	/**
	 * @return the x
	 */
	public int getX() {
		return (int)p.getX();
	}

	/**
	 * @param the x to set
	 */
	public void setX(int x) {
		this.p.setX(x);
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return (int)p.getY();
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.p.setY(y);
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
		p = new Point(x,y);
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
		p = new Point(0,0);
		
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
		this.p.setX(x);
		this.p.setY(y);
	}
	public void move(Point p)
	{
		if (p==null) return;
		this.p.setX((int)p.getX());
		this.p.setY((int)p.getY());
	}
	
	public Rectangle Union(Rectangle r)
	{
		if (r == null) return this;
		int xLeft = Math.min(this.getX(), r.getX());
		int yBottom = Math.min(this.getY(), r.getY());
		int xRight = Math.max(this.getX() + this.width, r.getX() + r.width);
		int yTop = Math.max(this.getY() + height, r.getY() + r.height);
		return new Rectangle(xLeft,yBottom,yTop - yBottom,xRight - xLeft);
	}
	public boolean isIntersect(Rectangle r)
	{
		if (getX() +width < r.getX() || r.getX()+r.width < getX() || getY()+height < r.getY() ||
				r.getY()+r.height<getY())
			return false;
		return true;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [x=" + getX() + ", y=" + getY() + ", height=" + height + ", width=" + width + "]";
	}
	
}
