import java.util.Arrays;

public class RGBImage {

	private RGBColor [][] matrix;
	private int row;
	private int column;
	public RGBImage(int row,int col)
	{
		this.row = row;
		this.column = col;
		matrix = new RGBColor[this.row][this.column];
		setPixelsColor(new RGBColor(0,0,0));
		
	}
	public RGBImage(RGBColor[][] pixels)
	{
		
	    row = pixels.length;
		column = pixels[0].length;
		matrix = new RGBColor[row][column];
		copy(pixels);
		
	}
	public RGBImage(RGBImage other)
	{
	    row = other.matrix.length;
		column = other.matrix[0].length;
		matrix = new RGBColor[row][column];
		copy(other.matrix);
	}
	private void setPixelsColor(RGBColor color)
	{
		if (matrix == null) return;
		for (int rowIndex = 0;rowIndex <matrix.length;rowIndex++)
		{
			int numOfColumn = matrix[rowIndex].length;
			for (int colIndex = 0;colIndex<numOfColumn;colIndex++)
			{
				matrix[rowIndex][colIndex] = color;
			}
		}
	}
	private void copy(RGBColor[][] source)
	{
		for (int rowIndex = 0;rowIndex <row;rowIndex++)
		{
			for (int colIndex = 0;colIndex<column;colIndex++)
			{
				matrix[rowIndex][colIndex] = source[rowIndex][colIndex];
			}
		}
	}
	public int getHeight()
	{
		return row;
	}
	public int getWidth()
	{
		return column;
	}
	public RGBColor getPixel(int row,int col)
	{
		if ((row>=0 && row<=this.row) && (col>=0 && col<=column))
		{
			return matrix[row][col];
		}
		return new RGBColor(0,0,0);
	}
	public void setPixel (int row, int col, RGBColor pixel)
	{
		if ((row>=0 && row<=this.row) && (col>=0 && col<=column))
		{
			 matrix[row][col] = pixel;
		}
	}
	public boolean equals (RGBImage other)
	{
		for (int rowIndex = 0;rowIndex <row;rowIndex++)
		{
			for (int colIndex = 0;colIndex<column;colIndex++)
			{
				if (matrix[rowIndex][colIndex] != other.matrix[rowIndex][colIndex])
					return false;
			}
		}
		return true;
	}
	public void flipHorizontal()
	{
		for (int rowIndex = 0;rowIndex <matrix.length;rowIndex++)
		{
			this.matrix[rowIndex] = reverseArray(matrix[rowIndex]);
		}
	}
	private RGBColor[] reverseArray(RGBColor[] array)
	{
		int tmpIndex = 0;
		RGBColor[] reveresedArray = new RGBColor[array.length];
		
		for (int index = array.length-1;index>=0;index--)
		{
			reveresedArray[tmpIndex++] = array[index];
		}
		return reveresedArray;
	}
	public  void flipVertical()
	{
		RGBColor tmp;
		for (int colIndex =0;colIndex<matrix[0].length;colIndex++)
		{
			int endIndex = matrix.length -1;	
			for (int rowIndex = 0;rowIndex < matrix.length;rowIndex++)
			{
				if (endIndex == rowIndex) break;
				tmp = matrix[rowIndex][colIndex];
				matrix[rowIndex][colIndex] = matrix[endIndex][colIndex];
				matrix[endIndex--][colIndex] = tmp;
			}
		}
	}
	public void invertColors()
	{
		for (int rowIndex = 0;rowIndex <row;rowIndex++)
		{
			for (int colIndex = 0;colIndex<column;colIndex++)
			{
				matrix[rowIndex][colIndex].invert();
			}
		}
	}
	public void rotateClockwise ()
	{
		RGBColor [][] newMatrix = new RGBColor[matrix[0].length][matrix.length];
		for (int rowIndex=0;rowIndex<newMatrix.length;rowIndex++)
		{
			for (int colIndex =0;colIndex<newMatrix[0].length;colIndex++)
			{
				newMatrix[rowIndex][colIndex] = matrix[matrix.length - colIndex-1][rowIndex];
			}
		}
		matrix = newMatrix;
		
	}
	
	public void rotateCounterClockwise ()
	{
		RGBColor [][] newMatrix = new RGBColor[matrix[matrix.length-1].length][matrix.length];
		for (int rowIndex=0;rowIndex<newMatrix.length;rowIndex++)
		{
			for (int colIndex =0;colIndex<newMatrix[0].length;colIndex++)
			{
				newMatrix[rowIndex][colIndex] = matrix[colIndex][matrix[0].length -rowIndex -1];
			}
		}
		matrix = newMatrix;
	}
	public void shiftCol (int offset)
	{
		if (offset >matrix[0].length || offset<=0) return;
		for (int rowIndex=0;rowIndex<matrix.length;rowIndex++)
		{
			for (int colIndex = matrix[0].length-1;colIndex>=offset;colIndex--)
			{
				matrix[rowIndex][colIndex] = matrix[rowIndex][colIndex-1];
			}
			for (int colIndex = 0;colIndex<offset;colIndex++)
			{
				matrix[rowIndex][colIndex] = new RGBColor(0,0,0);
			}
		}
	}
	public void shiftRow (int offset)
	{
		if (offset >matrix.length || offset<=0) return ;
		for (int colIndex = 0;colIndex<matrix[0].length;colIndex++)
		{
			for (int rowIndex=matrix.length-1;rowIndex>=offset;rowIndex--)
			{
				matrix[rowIndex][colIndex] = matrix[rowIndex-1][colIndex];

			}
			for (int rowIndex = 0;rowIndex<offset;rowIndex++)
			{
				matrix[rowIndex][colIndex] = new RGBColor(0,0,0);
			}
		}
	}
	public double[][] toGrayscaleArray ()
	{
		double [][] grayMatrix = new double[matrix.length][matrix[0].length];
		for (int rowIndex=0;rowIndex<matrix.length;rowIndex++)
		{
			for (int colIndex =0;colIndex<matrix[0].length;colIndex++)
			{
				grayMatrix[rowIndex][colIndex] =  matrix[rowIndex][colIndex].convertToGrayscale();
			}
		}
		return grayMatrix;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		for (int rowIndex = 0;rowIndex <matrix.length;rowIndex++)
		{
			
			for (int colIndex = 0;colIndex<matrix[0].length;colIndex++)
			{
				sb.append(matrix[rowIndex][colIndex].toString());
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public RGBColor[][] toRGBColorArray()
	{
		RGBColor[][] newMatrix = new RGBColor[matrix.length][matrix[0].length];
		for (int rowIndex = 0;rowIndex <matrix.length;rowIndex++)
		{
			for (int colIndex = 0;colIndex<matrix[0].length;colIndex++)
			{
				newMatrix[rowIndex][colIndex] = matrix[rowIndex][colIndex];
			}
		}
		return newMatrix;
	}
}
