package assignment03;
public class ANB_Employee 
{
	private String name;		//Employee's Name
	private String department;	//Employee's Department
	private String position;	//Employee's Position
	private int idNumber;		//Employee's ID Number

	//Constructors
	/**
	 * A constructor that accepts the following values as arguments , and assigns them to the
	 *	appropriate fields: employee's name, employee's id number, department, and position.
	 * @param nam		Arg
	 * @param id		Arg
	 * @param depart	Arg
	 * @param pos		Arg
	 */
	public ANB_Employee(String nam, int id, String depart, String pos)
	{
		name = nam;			//string
		idNumber = id;		//integer
		department = depart;//string
		position = pos;		//string
	}
	/**
	 * A constructor that accepts the following values as arguments and assigns them to the
	 *	appropriate fields: employee's name and ID number. The department and position
	 *	fields should be assigned an empty string ("") .
	 * @param nam		Arg
	 * @param id		Arg
	 */
	public ANB_Employee(String nam, int id)
	{
		name = nam;			//string
		idNumber = id;		//integer
		department = "";	//string
		position = "";		//string
	}
	/**
	 * A no-arg constructor that assigns empty strings ("") to the name, department, and
	 *	position fields, and 0 to the idNumber field.
	 */
	public ANB_Employee()
	{
		name = "";			//string
		idNumber = 0;		//integer
		department = "";	//string
		position = "";		//string
	}
	
	//Setters
	/**
	 * setName sets the name value
	 * @param nam Employee's Name
	 */
	public void setName(String nam)
	{
		name = nam;
	}
	/**
	 * setDepartment sets the department value
	 * @param depart Employee's Department
	 */
	public void setDepartment(String depart)
	{
		department = depart;
	}
	/**
	 * setIDNumber sets the idNumber value
	 * @param id Employee's id number
	 */
	public void setIDNumber(int id)
	{
		idNumber = id;
	}
	/**
	 * setPosition sets the position value
	 * @param pos Employee's position
	 */
	public void setPosition(String pos)
	{
		position = pos;
	}
	
	//Getters
	/**
	 * setName gets the name value
	 * @return name Employee's Name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * setDepartment gets the department value
	 * @return department Employee's Department
	 */
	public String getDepartment()
	{
		return department;
	}
	/**
	 * setIDNumber gets the idNumber value
	 * @return idNumber Employee's id number
	 */
	public Integer getIDNumber()
	{
		return idNumber;
	}
	/**
	 * setPosition gets the position value
	 * @return position Employee's position
	 */
	public String getPosition()
	{
		return position;
	}
	
	//Display Employee
	/**
	 * displayEmployee Prints out the employee's information
	 */
	public void displayEmployee()
	{
		System.out.println(name +"\t" + idNumber +"\t\t" + department +"\t" + position);
	}
}
