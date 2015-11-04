
public class Main {

	public static void main(String[] args) {
		RGBColor [][] colors = new RGBColor[3][4];
		colors[0][0] = new RGBColor(1,2,3);
		colors[0][1] = new RGBColor(11,12,13);
		colors[0][2] = new RGBColor(21,22,23);
		colors[0][3] = new RGBColor(31,32,33);
		
		colors[1][0] = new RGBColor(101,102,103);
		colors[1][1] = new RGBColor(111,112,112);
		colors[1][2] = new RGBColor(121,122,123);
		colors[1][3] = new RGBColor(131,132,133);
		
		colors[2][0] = new RGBColor(201,202,203);
		colors[2][1] = new RGBColor(211,212,212);
		colors[2][2] = new RGBColor(221,222,223);
		colors[2][3] = new RGBColor(231,232,233);
		
		RGBImage image = new RGBImage(colors);
		System.out.println("origin matrix");
		System.out.println(image.toString());
		
		RGBImage clonedImage = new RGBImage(image.toRGBColorArray());
		clonedImage.flipHorizontal();
		System.out.println("flipped horizontal matrix");
		System.out.println(clonedImage.toString());
		
		clonedImage = new RGBImage(image.toRGBColorArray());
		clonedImage.flipVertical();
		System.out.println("flipped vertical matrix");
		System.out.println(clonedImage.toString());
	
		clonedImage = new RGBImage(image.toRGBColorArray());
		clonedImage.shiftRow(2);
		System.out.println("shifted row by 2");
		System.out.println(clonedImage.toString());
	
		clonedImage = new RGBImage(image.toRGBColorArray());
		clonedImage.shiftCol(2);
		System.out.println("shifted column by 2");
		System.out.println(clonedImage.toString());
		
		clonedImage = new RGBImage(image.toRGBColorArray());
		clonedImage.rotateClockwise();
		System.out.println("rotated clockwise");
		System.out.println(clonedImage.toString());
		
		clonedImage = new RGBImage(image.toRGBColorArray());
		clonedImage.rotateCounterClockwise();
		System.out.println("rotated counter clockwise");
		System.out.println(clonedImage.toString());
	}	
		
	
	
	public static String[][] flipHorizontal(String[][] array)
	{
		
		
		for (int rowIndex = 0;rowIndex <array.length;rowIndex++)
		{
			array[rowIndex] = reverseArray(array[rowIndex]);
		}
		return array;
	}
	
	public static String[][] flipVertical(String[][] array)
	{
		String tmp = "";
		for (int colIndex =0;colIndex<array[0].length;colIndex++)
		{
			int endIndex = array.length -1;	
			for (int rowIndex = 0;rowIndex < array.length;rowIndex++)
			{
				if (endIndex == rowIndex) break;
				tmp = array[rowIndex][colIndex];
				array[rowIndex][colIndex] = array[endIndex][colIndex];
				array[endIndex--][colIndex] = tmp;
			}
		}
		
		return array;
	}
	private static void switchPlaces(String s1,String s2)
	{
		String tmp =s1;
		s1 = s2;
		s2 =tmp;
	}
	private static String[] reverseArray(String[] array)
	{
		int tmpIndex = 0;
		String[] reveresedArray = new String[array.length];
		
		for (int index = array.length-1;index>=0;index--)
		{
			reveresedArray[tmpIndex++] = array[index];
		}
		return reveresedArray;
	}
	private static void printMatrix(String[][]matrix)
	{
		for (int rowIndex = 0;rowIndex <matrix.length;rowIndex++)
		{
			
			for (int colIndex = 0;colIndex<matrix[0].length;colIndex++)
			{
				System.out.print(matrix[rowIndex][colIndex] + "");
			}
			System.out.println("");
		}
	}
	public static String[][] rotateClockwise (String[][]matrix)
	{
		String [][] newArray = new String[matrix[0].length][matrix.length];
		for (int rowIndex=0;rowIndex<newArray.length;rowIndex++)
		{
			for (int colIndex =0;colIndex<newArray[0].length;colIndex++)
			{
				newArray[rowIndex][colIndex] = matrix[matrix.length - colIndex-1][rowIndex];
			}
		}
		return newArray;
	}
	
	public static String[][] rotateCounterClockwise (String[][]matrix)
	{
		String [][] newArray = new String[matrix[matrix.length-1].length][matrix.length];
		for (int rowIndex=0;rowIndex<newArray.length;rowIndex++)
		{
			for (int colIndex =0;colIndex<newArray[0].length;colIndex++)
			{
				newArray[rowIndex][colIndex] = matrix[colIndex][matrix[0].length -rowIndex -1];
			}
		}
		return newArray;
	}
	public static String[][] shiftCol (String[][]matrix,int offset)
	{
		if (offset >matrix[0].length || offset<=0) return matrix;
		for (int rowIndex=0;rowIndex<matrix.length;rowIndex++)
		{
			for (int colIndex = matrix[0].length-1;colIndex>=offset;colIndex--)
			{
				matrix[rowIndex][colIndex] = matrix[rowIndex][colIndex-1];
			
			}
			for (int colIndex = 0;colIndex<offset;colIndex++)
				{
					matrix[rowIndex][colIndex] = "0";
				}
		}
		return matrix;
		
	}
	public static String[][] shiftRow (String[][]matrix,int offset)
	{
		if (offset >matrix.length || offset<=0) return matrix;
		for (int colIndex = 0;colIndex<matrix[0].length;colIndex++)
		{
			for (int rowIndex=matrix.length-1;rowIndex>=offset;rowIndex--)
			{
				matrix[rowIndex][colIndex] = matrix[rowIndex-1][colIndex];

			}
			for (int rowIndex = 0;rowIndex<offset;rowIndex++)
			{
				matrix[rowIndex][colIndex] = "0";
			}
		}

		return matrix;
		
	}
}
