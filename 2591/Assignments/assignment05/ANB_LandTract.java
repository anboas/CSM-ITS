package assignment05;
public class ANB_LandTract {
	private double length;
	private double width;
	
	/**
	 * Constructor for tract
	 * @param length
	 * @param width
	 */
	public ANB_LandTract(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	/**
	 * calculates area of tract
	 * @return area
	 */
	public double getArea()
	{
		double area;
		area = this.length * this.width;
		return area;		
	}
	
	/**
	 * checks whether two tracts are equal
	 * @param tract2
	 * @return isEqual status
	 */
	public boolean equals(ANB_LandTract tract2)
	{
		boolean isEqual;
		if (this.length == tract2.length && this.width == tract2.width)
		{
		isEqual = true;	
		} else {
		isEqual = false;
		}
		return isEqual;
	}
	
	/**
	 * To string method for tract
	 * Returns length, width and area
	 */
	public String toString()
	{
		String str1 = "";
		str1 += "\nThe length of the tract is: " + this.length;
		str1 += "\nThe width of the tract is: " + this.width;
		str1 += "\nThe area of the tract is: " + getArea();
		str1 += "\n";
		return str1;		
	}
}