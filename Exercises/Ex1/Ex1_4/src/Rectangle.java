
public class Rectangle {

	private double x = 0;
	private double y = 0;
	private double length = 0;
	private double width = 0;
	
	
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @param x
	 * @param y
	 * @param length
	 * @param width
	 */
	public Rectangle(double x, double y, double length, double width) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
	}
	
	
	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	
	
	public int area()
	{
		Double rectArea = length * width;
		return rectArea.intValue();
	}
	
}
