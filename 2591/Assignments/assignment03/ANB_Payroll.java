package assignment03;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ANB_Payroll 
{
	private String employeeName;
	private int idNumber;
	private double hourlyPay;
	private double hoursWorked;
	DecimalFormat decForm = new DecimalFormat("#0.00");
	Scanner getValue = new Scanner(System.in);
	
	//Constructor
	/**
	 * Default Constructor for Payroll Class
	 */
	public ANB_Payroll()
	{
		System.out.println("Please input the employee's name: ");
		employeeName = getValue.nextLine();
		System.out.println("Please input the employee's ID Number: ");
		idNumber = getValue.nextInt();
		System.out.println("Please input the employee's Hourly Pay: ");
		hourlyPay = getValue.nextDouble();
		System.out.println("Please input the number of hours the emplyee worked: ");
		hoursWorked = getValue.nextDouble();
	}
		
	//Setters
	/**
	 * Sets employee's name
	 * @param name
	 */
	public void setEmployeeName(String name)
	{
		employeeName = name;
	}
	/**
	 * sets employee's ID Number
	 * @param id
	 */
	public void setIDNumber(int id)
	{
		idNumber = id;
	}
	/**
	 * sets employee's hourly pay
	 * @param hourpay
	 */
	public void setHourlyPay(double hourpay)
	{
		hourlyPay = hourpay;
	}
	/**
	 * sets employee's hours worked
	 * @param hoursworked
	 */
	public void setHoursWorked(double hoursworked)
	{
		hoursWorked = hoursworked;
	}
	
	//Getters
	/**
	 * gets employee's name
	 * @return employee's name
	 */
	public String setEmployeeName()
	{
		return employeeName;
	}
	/**
	 * gets employee's ID Number
	 * @return employee's ID Number
	 */
	public int setIDNumber()
	{
		return idNumber;
	}
	/**
	 * gets employee's hourly pay
	 * @return employee's hourly pay
	 */
	public double setHourlyPay()
	{
		return hourlyPay;
	}
	/**
	 * gets employee's hours worked
	 * @return employee's hours worked
	 */
	public double setHoursWorked()
	{
		return hoursWorked;
	}
	
	//Display Employee Info
	/**
	 * Displays all information on an entry in payroll
	 */
	public void displayEmployeeInformation()
	{
		System.out.println("Name: \t\t" + employeeName);
		System.out.println("ID Number: \t" + idNumber);
		System.out.println("Hourly Pay: \t" + hourlyPay);
		System.out.println("Hours Worked: \t" + hoursWorked);
		System.out.println("Gross Pay: \t$" + decForm.format(calculateGrossPay()));
	}
	//Calculations
	/**
	 * Calculates gross pay
	 * @return gross pay
	 */
	public double calculateGrossPay()
	{
		double grossPay;
		grossPay = hoursWorked * hourlyPay;
		return grossPay;
	}
}
