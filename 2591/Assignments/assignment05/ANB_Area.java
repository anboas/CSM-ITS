package assignment05;
public class ANB_Area {
	
	/**
	 * @param radius double
	 * @return area of a circle
	 */
	public static double getArea(double radius) {
		// Circle
		double area;
		
		area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}

	/**
	 * @param length int
	 * @param width int
	 * @return area of a rectangle
	 */
	public static int getArea(int length, int width) {
		// Rectangle
		int area;
		
		area = length * width;
		
		return area;
	}
	
	/**
	 * @param radius double
	 * @param height double
	 * @return area of a cylinder
	 */
	public static double getArea(double radius, double height) {
		// Cylinder
		double area;
		
		// This formula was taken from google "Area of a Cylinder"
		area = (2 * Math.PI * radius * height) + 2 * (Math.PI * Math.pow(radius, 2));
		
		return area;
	}

	
}