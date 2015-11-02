import java.awt.Point;
import java.util.Arrays;

public class Polygon {
	Point [] points;
	private int polygonSize = 0;

	public int getPolygonSize() {
		return polygonSize;
	}
	public void setPolygonSize(int polygonSize) {
		this.polygonSize = polygonSize;
	}

	
	/**
	 * @param points
	 */
	public Polygon(int size) {
		polygonSize = size;
		this.points = new Point[polygonSize];
	}
	public void add(Point p)
	{
		if (points.length == count())
		{
			throw new ArrayStoreException();
		}
		points[count()] = p;
	}
	public int count()
	{
		for (int i=0;i<polygonSize;i++)
		{
			if (points[i] == null)
			{
				return (i);
			}
		}
		return 0;
	}
	public int length()
	{
		return points.length;
	}
	@Override
	public String toString() {
		return "Polygon [points=" + Arrays.toString(points) + ", polygonSize=" + polygonSize + "]";
	}
	
	
}
