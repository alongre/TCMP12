import java.util.ArrayList;



public class ShapeContainer {

	private ArrayList<IShape> shapesList = new ArrayList<IShape>();
	public ShapeContainer(Shape[] shapes)
	{
		 for(IShape shape:shapes)
		 {
			 shapesList.add(shape);
		 }
	}
	public ShapeContainer()
	{
		
	}
	public int count()
	{
		return shapesList.size();
	}
	
	public boolean add(IShape shape)
	{
		if (shapesList.contains(shape)) return false;
		shapesList.add(shape);
		return true;
	}

	 public void drawAll()
	 {
		 for(IShape shape:shapesList)
		 {
			 shape.draw();
		 }

	 }

	 public boolean remove( int index)
	 {
		 if (shapesList.size()>index) return false;
		 shapesList.remove(index);
		 return true;
	 }

	 public boolean remove( IShape shape)
	 {
		 if (!shapesList.contains(shape)) return false;
		 return shapesList.remove(shape);
	 }

	 public boolean removeAll()
	 {
		 shapesList.clear();
		 return true;
	 }

	 public void resizeAll ( int percent )
	 {
		 for(IShape shape:shapesList)
		 {
			 shape.resize(percent);
		 }
	 }
	 @Override
	 public String toString()
	 {
		 StringBuilder sb = new StringBuilder();
		 for(IShape shape:shapesList)
		 {
			 sb.append("\nShape name: " + shape.getName());
			 sb.append("\nShape color: " + shape.getColor());
			 sb.append("\nArea is: " + shape.area());
			 sb.append("\nPerimeter is: " + shape.perimeter());
			 sb.append("\n----------------------------");
		 }
		 return sb.toString();
	 }
}
