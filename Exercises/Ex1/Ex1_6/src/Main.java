import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the polygon:");
		int polygonSize = sc.nextInt();
		
		for (int i=0;i<polygonSize;i++)
		{
			System.out.println("Please enter point number: " + (i+1));
			System.out.println("x value:");
			sc.nextLine();
			int tmpX = sc.nextInt();
			System.out.println("y value:");
			int tmpY = sc.nextInt();
		}
		sc.close();
	
	}

}
