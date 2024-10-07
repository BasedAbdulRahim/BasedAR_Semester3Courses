package edu.seg2105.assignment1.exercise2.entities;

import java.util.ArrayList;
import java.util.List;

import edu.seg2105.assignment1.exercise2.util.TableGenerator;

/**
 * The Administrator class represents an administrative employee with specific tasks.
 * Extends the Employee class.
 * 
 * @autor Hussein Al Osman
 */
public class Administrator extends Employee{

	// List of tasks assigned to the administrator
	List<String> tasks;

	/**
	 * Constructs a new Administrator with the given details.
	 * 
	 * @param firstName the first name of the administrator
	 * @param lastName the last name of the administrator
	 * @param id the ID of the administrator
	 * @param salary the salary of the administrator
	 */
	public Administrator(String firstName, String lastName, String id, double salary) {
		super(firstName, lastName, id, salary);
		tasks = new ArrayList<String>();
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	private String getTasksList() {
		 // We will generate a table that corresponds to the list of courses taught by this instructor.
        // The table's columns are Course code, and Course title. 
        // To do so, we will transfer the data in the courses list into a 2D array
        // The length of the array corresponds to the number of elements in the courses list,
        // while the width is 2 (since we have two columns).
        int tableRows = tasks.size();
     

        String[][] data = new String[tableRows][1]; // This 2D array will contain the data

        String[] headers = new String[1]; // This array will contain the column headers

        // Fill the first row with column headers
        headers[0] = "TaskList";

        // Fill the rest of the 2D array with the information from the courses list
        for (int i = 0; i < data.length; i++) {
            data[i][0] = tasks.get(i);
           
        }

        // Use our utility class to generate a string that is formatted like a table
        String tableStr = TableGenerator.generateTableString(data, headers, 20);

        return tableStr;
	}
	
	public String toString() {
    	
	    
        return "Admin information:\n"
                + "\tFirst name: " + getFirstName() + "\n"
                + "\tLast name: " + getLastName() + "\n"
                + "\tEmployee ID: " + getId() + "\n"
                + "\tSalary: " + getSalary() + "\n"
                + (tasks.size() > 0 ? "\tList of assigned courses:" + getTasksList() : "");
                
         
    }
	
	
	


}
