package assignment03;
import java.text.DecimalFormat;

public class ANB_Circle 
{
	//Constants
	private final double PI = 3.14159;
	
	//Variables
	private double radius;			//field
	private double area;			//area = PI * radius * radius
	private double diameter;		//diameter = radius * 2
	private double circumference;	//circumference = 2 * PI * radius
	DecimalFormat decForm = new DecimalFormat("#0.00");
	
	
	public ANB_Circle()
	{
		radius = 0.0;
	}
	public ANB_Circle(double rad)
	{
		radius = rad;
	}
	
	//Setter
	public void setRadius(double rad)
	{
		radius = rad;
	}

	//Getters
	public double getRadius()
	{
		return radius;
	}
	
	//Calculations
	public double calculateArea()
	{
		area = PI * radius * radius;
		return area;
	}
	public double calculateDiameter()
	{
		diameter = radius * 2;
		return diameter;
	}
	public double calculateCircumference()
	{
		circumference = 2 * PI * radius;
		return circumference;
	}
	
	// toString
	/**
	 * The toString method returns information about a Rectangle object
	 */
	public String toString()
	{
		String str1 = "\n";
		str1 += " Radius is: " + decForm.format(radius) + "\n";
		str1 += " Area is: " + decForm.format(calculateArea()) + "\n";
		str1 += " Diameter is: " + decForm.format(calculateDiameter()) + "\n";
		str1 += " Circumference is: "+ decForm.format(calculateCircumference()) + "\n";
		return str1;	
	}
}
