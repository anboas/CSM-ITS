package assignment03;
public class ANB_PersonalInfo 
{
	private String name;
	private String address;
	private String age;
	private String phoneNumber;
	
	//Constructors
	/**
	 * Constructor method for personalInfo class
	 * @param nam		name
	 * @param add		address
	 * @param ag		age
	 * @param number	phoneNumber
	 */
	public ANB_PersonalInfo(String nam, String add, String ag, String number)
	{
		name = nam;
		address = add;
		age = ag;
		phoneNumber = number;
	}	
	/**
	 * Default constructor for personalInfo class
	 */
	public ANB_PersonalInfo()
	{
		name = "";
		address = "";
		age = "";
		phoneNumber = "1115555555";
	}
	
	//Setters
	/**
	 * Sets name value
	 * @param nam
	 */
	public void setName(String nam)
	{
		name = nam;
	}
	/**
	 * Sets address value
	 * @param add
	 */
	public void setAddress(String add)
	{
		address = add;
	}
	/**
	 * Sets age value
	 * @param ag
	 */
	public void setAge(String ag)
	{
		age = ag;
	}
	/**
	 * Sets phoneNumber value
	 * @param number
	 */
	public void setPhoneNumber(String number)
	{
		phoneNumber = number;
	}

	//Getters
	/**
	 * Gets name value
	 * @return name value
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Gets address value
	 * @return address value
	 */
	public String getAddress()
	{
		return address;
	}
	/**
	 * Gets age value
	 * @return age value
	 */
	public String getAge()
	{
		return age;
	}
	/**
	 * Gets phoneNumber Value
	 * @return phoneNumber Value
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	//Display Info
	/**
	 * displayInfo method returns the formatted output of the values stored in the peronalInfo class
	 */
	public void displayInfo()
	{
		String phonePos1 = phoneNumber.substring(0, 3);
		String phonePos2 = phoneNumber.substring(3, 6);
		String phonePos3 = phoneNumber.substring(6, 10);
							
		phoneNumber = "(" + phonePos1 + ") " + phonePos2 + "-" + phonePos3;
		System.out.println(name + "\t" + address + "\t\t" + age + "\t" + phoneNumber);
	}
	
}
