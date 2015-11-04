
public class RGBColor {

	private int red,green,blue;

	/**
	 * @return the red
	 */
	public int getRed() {
		return red;
	}

	/**
	 * @param red the red to set
	 */
	public void setRed(int red) {
		this.red = red;
	}

	/**
	 * @return the green
	 */
	public int getGreen() {
		return green;
	}

	/**
	 * @param green the green to set
	 */
	public void setGreen(int green) {
		this.green = green;
	}

	/**
	 * @return the blue
	 */
	public int getBlue() {
		return blue;
	}

	/**
	 * @param blue the blue to set
	 */
	public void setBlue(int blue) {
		this.blue = blue;
	}

	public RGBColor()
	{
		red =0;
		green = 0;
		blue = 0;
	}
	/**
	 * @param red
	 * @param green
	 * @param blue
	 */
	public RGBColor(int red, int green, int blue) {
		if (isValid(red) && isValid(green) && isValid(blue))
		{
			this.red = red;
			this.green = green;
			this.blue = blue;
		}
		else
		{
			throw new ExceptionInInitializerError("R.G.B values are not between 0...255");
			
		}
	}
	private boolean isValid(int rgb)
	{
		if (rgb>=0 && rgb<=255) return true;
		return false;
	}
	public RGBColor(RGBColor other)
	{
		this.red = other.red;
		this.green = other.green;
		this.blue = other.blue;
	}
	void mix(RGBColor other)
	{
		this.red = Math.round((other.red + this.red)/2);
		this.green = Math.round((other.green + this.green)/2);
		this.blue = Math.round((other.blue + this.blue)/2);
	
	}
	double convertToGrayscale()
	{
		return (red *0.3) + (green * 0.59) + (blue * 0.11);
	}
	void invert()
	{
		red = 255 - red;
		green = 255 - green;
		blue = 255 - blue;	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  "(" +red + "," + green + "," + blue + ")";
	}

	public boolean equals(RGBColor other)
	{
		if (red == other.red && green == other.green && blue == other.blue)
			return true;
		return false;
	}
	
	
	
}
