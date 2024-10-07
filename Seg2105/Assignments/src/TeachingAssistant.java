import java.util.ArrayList;
import java.util.List;

public class TeachingAssistant extends Instructor{
	

    // List of courses assigned to the instructor
    private static final int MAX_COURSE_LOAD = 3;

    /**
     * Constructs a new Instructor with the specified details.
     *
     * @param firstName the first name of the instructor
     * @param lastName the last name of the instructor
     * @param id the unique identifier of the instructor
     * @param salary the salary of the instructor
     */
    public TeachingAssistant(String firstName, String lastName, String id, double salary) {
        super(firstName, lastName, id, salary);
    
    }

    /**
     * Gets the list of courses assigned to the instructor.
     *
     * @return the list of courses
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * Abstract method to assign a course to the instructor.
     * Subclasses must implement this method to specify constraints on course assignment.
     *
     * @param course the course to be assigned
     * @return a boolean specifying whether the course assignment was successful
     */
    public boolean assignCourse(Course course) {
    	if(courses.size()>=MAX_COURSE_LOAD) {
    		System.out.println("Course Load is Full")
    		return false;
    	}else { 
    		courses.add(course);
    	
    	return true;
    	}
    }

    /**
     * Generates a table string of the courses assigned to the instructor.
     *
     * @return the formatted table string of courses
     */
   
    public String toString() {
        return "TeachingAssistant information:\n"
                + "\tFirst name: " + getFirstName() + "\n"
                + "\tLast name: " + getLastName() + "\n"
                + "\tEmployee ID: " + getId() + "\n"
                + "\tSalary: " + getSalary() + "\n"
                + (courses.size() > 0 ? "\tList of assigned courses:" + getCoursesTable() : "");
                
         
    }
}
