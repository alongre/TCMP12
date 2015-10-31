
public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(20,10);
		Rectangle r2 = new Rectangle(5,5,20,10);
		System.out.println("r1 Area = " + r1.area());		
		System.out.println("r2 Perimeter = " + r2.perimeter());		
		if (r1.isEqual(r2))
			System.out.println("r1 and r2 are equal");
		else
			System.out.println("r1 and r2 are not equal");
		if (r1.isIntersect(r2))
			System.out.println("r1 and r2 are intersecrting");
		else
			System.out.println("r1 and r2 are not intersecrting");
		
		//move
		r2.move(30,5);
		System.out.println("moving r2 to (30,5)");
		if (r1.isIntersect(r2))
			System.out.println("r1 and r2 are intersecrting");
		else
			System.out.println("r1 and r2 are not intersecrting");
		
		r1.move(new Point(20,0));
		System.out.println("moving r1 to (20,0)");
		if (r1.isIntersect(r2))
			System.out.println("r1 and r2 are intersecrting");
		else
			System.out.println("r1 and r2 are not intersecrting");
		
		
		//resize
		r1.resize(50);
		System.out.println("resizing to 50%");
		if (r1.isEqual(r2))
			System.out.println("r1 and r2 are equal");
		else
			System.out.println("r1 and r2 are not equal");
		
		r1.resize(200);
		System.out.println("resizing to 200%");
		if (r1.isEqual(r2))
			System.out.println("r1 and r2 are equal");
		else
			System.out.println("r1 and r2 are not equal");
		
		
		Rectangle newRect = r1.Union(r2);
		System.out.println("Rect r1: " + r1.toString());
		System.out.println("Rect r2: " + r2.toString());
		System.out.println("After union = " + newRect.toString());
		
		
	}

}
