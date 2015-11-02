import java.util.Scanner;
import java.awt.Point;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the polygon:");
		int polygonSize = sc.nextInt();
		Polygon polygon = new Polygon(polygonSize);
		int x,y;
		for (int i=0;i<polygonSize;i++)
		{
			System.out.println("Please enter point number: " + (i+1));
			System.out.println("Enter (x,y) point:");
			sc.nextLine();
			polygon.add(new Point(sc.nextInt(),sc.nextInt()));
		}
		sc.close();
		System.out.println("Polygon Size: " + polygon.length());
		System.out.println(polygon.toString());
	}

}
