package edu.wit.cs.comp1050;

import java.util.ArrayList;
import java.util.List;

//TODO: document this class
public class Student {
	
	/**
	 * Semester names
	 */
	public static final String[] SEMESTERS = {"Summer", "Fall", "Spring"};
	
	/**
	 * Credits threshold for full-time classification 
	 */
	public static final int FT_CREDITS = 12;
	
	//
	
	/**
	 * Sets the current semester to Spring 2017
	 */
	public static void resetSemesterYear() {
		// replace with your code
	}
	
	/**
	 * Sets to the semester following the
	 * current semester
	 */
	public static void nextSemester() {
		// replace with your code
	}
	
	/**
	 * Gets the current semester
	 * 
	 * @return Summer/Fall/Spring
	 */
	public static String getCurrentSemester() {
		return ""; // replace with your code
	}
	
	/**
	 * Gets the current year
	 * 
	 * @return current year
	 */
	public static int getCurrentYear() {
		return 0; // replace with your code
	}
	
	/**
	 * Gets the current semester and year
	 * 
	 * @return "semester year"
	 */
	public static String getCurrentSemesterYear() {
		return ""; // replace with your code
	}
	
	/**
	 * Searches all students in the current semester/year
	 * (in order of construction) and returns a list
	 * that pass a supplied filter
	 * 
	 * @param f filter to apply to each student
	 * @return a list of students that satisfy the filter
	 */
	public static List<Student> find(StudentFilter f) {
		return new ArrayList<Student>(); // replace with your code
	}
	
	//
	
	/**
	 * Creates a new student, in a supplied major,
	 * associated with the current semester/year
	 * 
	 * @param major student major
	 */
	public Student(String major) {
		// replace with your code
	}
	
	/**
	 * String representation of the student.
	 * The "studentnum" portion refers to
	 * the order in which the student was
	 * constructed in the current semester/year,
	 * starting at #1, #2, ... 
	 * 
	 * @return "semester year #studentnum"
	 */
	@Override
	public String toString() {
		return ""; // replace with your code
	}
	
	/**
	 * Gets the semester for this
	 * student (may be different
	 * than the current semester)
	 * 
	 * @return Summer/Fall/Spring
	 */
	public String getSemester() {
		return ""; // replace with your code
	}
	
	/**
	 * Gets the year for this
	 * student (may be different
	 * than the current year)
	 * 
	 * @return year
	 */
	public int getYear() {
		return 0; // replace with your code
	}
	
	/**
	 * Gets the major for this
	 * student
	 * 
	 * @return student major
	 */
	public String getMajor() {
		return ""; // replace with your code
	}
	
	/**
	 * Adds a weighted course result 
	 * 
	 * @param credits course credits (assumed to be positive)
	 * @param weight numeric weight (e.g. A = 4; assumed to be positive)
	 */
	public void addClass(int credits, double weight) {
		// replace with your code
	}
	
	/**
	 * Returns true if the student
	 * is full time with respect to
	 * currently added course credits
	 * 
	 * @return true if credits is at least the threshold
	 */
	public boolean isFullTime() {
		return false; // replace with your code
	}
	
	/**
	 * Computes the student's current GPA
	 * with respect to added course credits/
	 * weights
	 * 
	 * @return student GPA (0 if no credits)
	 */
	public double getGPA() {
		return 0.; // replace with your code
	}
	
}
