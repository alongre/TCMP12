import java.awt.Color;

public interface IShape {

	void draw();
	void resize(int percent);
	void move(Point p);
	void remove();
	boolean isEqual(IShape shape);
	void move(int x,int y);
	double area();
	double perimeter();
	String getName();
	void setName(String name);
	Color getColor();

	
}
