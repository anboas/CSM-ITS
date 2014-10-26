package assignment03;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ANB_Rectangle
{
	private double length;
	private double width;
	private double area;
	private double perimeter;
	Scanner getValue = new Scanner(System.in);
	DecimalFormat decForm = new DecimalFormat("##0.000");
	//Constructors
	/**
	 * rectangle Constructor
	 * @param len Length of the rectangle.
	 * @param wid Width of the rectangle.
	 */
	public ANB_Rectangle(double len, double wid)
	{
		length = len;
		width = wid;
	}
	/**
	 * Default constructor
	 */
	public ANB_Rectangle()
	{
		length = 1;
		width = 1;
	}
	//Setters
	/**
	 * setLength method stores a value in the 
	 * length field
	 * @param len The length of the rectangle
	 */
	public double setLength()
	{
		System.out.println("Please input the length of the rectangle: ");
		length = getValue.nextDouble();
		return length;
	}
	/**
	 * setWidth method stores a value in the 
	 * width field
	 * @param wid The width of the rectangle
	 */
	public double setWidth()
	{
		System.out.println("Please input the width of the rectangle: ");
		width = getValue.nextDouble();
		return width;
	}
	
	//Getters
	/**
	 * setLength method returns the value of the
	 * length field
	 * @return returns the Length field
	 */
	public double getLength()
	{
		return length;
	}
	/**
	 * setWidth method returns the value of the
	 * width field
	 * @return returns the width field.
	 */
	public double getWidth()
	{
		return width;
	}
	
	//Display Data
	/**
	 * displayData method displays Width, Length and Area
	 * @param widthDisplay Input width
	 * @param lengthDisplay Input length
	 * @param areaDisplay Input area
	 */
	public void displayData(double widthDisplay, double lengthDisplay, double areaDisplay)
	{
		System.out.println("The width of the rectangle is:  " + decForm.format(widthDisplay));
		System.out.println("The length of the rectangle is: " + decForm.format(lengthDisplay));
		System.out.println("The area of the rectangle is:   " + decForm.format(areaDisplay));
	}
	//Calculations
	/**
	 * calculateArea method returns length * width
	 * @return
	 */
	public double calculateArea()
	{
		area = length * width;
		return area;
	}
	/**
	 * calculatePerimeter method returns the box's 
	 * perimeter
	 * @return width + width + length + length
	 */
	public double calculatePerimeter()
	{
		double widTwo;
		double lenTwo;
	
		widTwo = width + width;
		lenTwo = length + length;
		perimeter = widTwo + lenTwo;
		
		return perimeter;
	}
}

