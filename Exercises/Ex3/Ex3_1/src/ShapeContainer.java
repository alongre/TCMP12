public class ShapeContainer {

	private Shape[] shapesList;
	private int index;
	public ShapeContainer(int size)
	{
		index = 0;
		if (size>0)
		{
			shapesList = new Shape[size];
		}
	}
	
	
	 public boolean add( Shape shape)
	 {
		 if (index<shapesList.length && index>=0 && !contains(shape))
		 {
			 shapesList[index++] = shape;
			 return true;
		 }
		 return false;
	 }
	public boolean add( GeometricableObject geometricableObject)
	{
		Shape shape = (Shape)geometricableObject;
		if (index<shapesList.length && index>=0 && !contains(shape))
		{
			shapesList[index++] = shape;
			return true;
		}
		return false;
	}
	 private boolean contains(Shape shape)
	 {
		 for(Shape s:shapesList)
		 {
			 if (s == null) break;
			 if (s.equals(shape)) return true;
		 }
		 return false;
	 }
	
	 public void drawAll()
	 {
		 for(Shape shape:shapesList)
		 {
			 if (shape==null) break;
			 shape.draw();
		 }

	 }

	 public boolean remove( int arrayIndex)
	 {
		 if (arrayIndex>=0 && index<shapesList.length)
		 {
			 //last item on the array
			 if (arrayIndex == shapesList.length-1)
			 {
				 shapesList[index--] = null;
				 return true;
			 }
			 for (int i = arrayIndex;i<shapesList.length-1;i++)
			 {
				 shapesList[i] =  shapesList[i+1];
			 }
			 index--;
			 return true;
		 }
		 return false;
	 }

	 public boolean remove( Shape shape)
	 {
		 if (index<shapesList.length && index>=0 && contains(shape))
		 {
			 int locatedIndex = getIndex(shape);
			 return remove(locatedIndex);
		 }
		 return false;
	 }
	 private int getIndex(Shape shape)
	 {
		 for (int arrayIndex=0;arrayIndex<shapesList.length;arrayIndex++)
		 {
			 if (shapesList[arrayIndex].equals(shape)) return arrayIndex;
		 }
		 return -1;
	 }


	 public boolean removeAll()
	 {
		 if (shapesList.length == 0) return false;
		 for (int index = 0; index<shapesList.length;index++)
		 {
			 shapesList[index] = null;
		 }
		 index = 0;
		 return true;
	 }

	 public void resizeAll ( int percent )
	 {
		 for(Shape shape:shapesList)
		 {
			 if (shape==null) break;
			 shape.resize(percent);
		 }
	 }
	public void move(direction moveTo)
	{
		for(Shape shape:shapesList) {
			if (shape==null) return;
			switch (moveTo) {
				case Left:
					shape.moveLeft();
					break;
				case Right:
					shape.moveRight();
					break;
				case Up:
					shape.moveUp();
					break;
				case Down:
					shape.moveDown();
					break;
				default:
			}

		}
	}
	 @Override
	 public String toString()
	 {
		 StringBuilder sb = new StringBuilder();
		 for(Shape shape:shapesList)
		 {
			 if (shape==null) break;
			 sb.append("\nShape color: " + shape.getColor());
			 if (shape instanceof  GeometricableObject)
			 {
				 GeometricableObject gShape = (GeometricableObject)shape;
				 sb.append("\nArea is: " + gShape.area());
				 sb.append("\nPerimeter is: " + gShape.perimeter());
			 }
			 sb.append("\n----------------------------");
		 }
		 return sb.toString();
	 }

	public double areaOfAll(GeometricableObject[] geometricableObjects)
	{
		double totalArea = 0;
		for (GeometricableObject go:geometricableObjects) {
			totalArea += go.area();
		}
		return totalArea;
	}
}

enum direction
{
	Left,
	Right,
	Up,
	Down
};
