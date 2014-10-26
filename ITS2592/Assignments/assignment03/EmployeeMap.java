package assignment03;
import java.util.SortedMap;
import java.util.TreeMap;

public class EmployeeMap {
	private SortedMap<String, Employee> employeeMap = new TreeMap<String,Employee>();

	/**
	 * Add an employee Object value and ID key
	 * @param IDNumber Key
	 * @param employee Value
	 */
	public void add(String IDNumber, Employee employee) {
		employeeMap.put(IDNumber,employee);
	}

	/**
	 * Search for an employee based upon their ID 
	 * @param id
	 * @return
	 */
	public String findEmployee(String id) {
		String returnStatement;
		
		// Checks if an employee is valid
		if(employeeMap.containsKey(id)){
			returnStatement = "\nEmployee ID: " + id + employeeMap.get(id);
		} else {
			returnStatement = "ID: '" + id + "' is not a valid employee.";
		}
		
		return returnStatement;
	}
	
	/**
	 * Prints the size of the employee map
	 * @return
	 */
	public int size(){
		return employeeMap.size();
	}
} 