
/**
 * @author alongreen
 *
 */
public class Point {
	
	private double x =0;
	private double y=0;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	
	public Point()
	{
		
	}
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return boolean if the point is on the origin
	 */
	public boolean isAtOrigin()
	{
		if (x==0 && y==0) return true;
		else return false;
	}
	private double distanceFrom(Point point)
	{
		if (point == null) return 0;
		if (this.isAtOrigin() && point.isAtOrigin() ) return 0;
		double width = Math.abs(x - point.x);
		double height = Math.abs(y - point.y);
		return Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
	}
	/**
	 * @return the distance of the point from 0,0
	 */
	public double distance()
	{
		return distanceFrom(new Point(0,0));
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	/**
	 * @param x
	 * @param y
	 * @return distance from x,y point
	 */
	public double distance(int x,int y)
	{
		return distanceFrom(new Point(x,y));
	}
	
	/**
	 * @param p
	 * @return distance from p
	 */
	public double distance(Point p)
	{
		return distanceFrom(p);
	}
}
