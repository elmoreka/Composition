/* Java program to create a Birthday class of month day and year.  This will be called on from
* the java program TestComposition as an example of composition.  The program will return the values for
* month, day, and year in the format month/day/year.
*
*   Author: Karl Elmore
*   Program: Birthday.java
*/
public class Birthday { // create subclass Dogs and inherit fields from Animals superclass.
	private int month;  //  create variable integer month
	private int day;  //  create variable integer day
	private int year;  //  create variable integer year
	
	public Birthday(int m, int d, int y){ // gets the value of favToy
		month = m; // set variable month equal to variable m
		day = d;  // set variable day equal to variable d
		year = y;  // set variable year equal to variable y
		System.out.printf("The constructor for this is %s/n", this);  // Prints text to the console
	}
	public String toString() {  // create method toString
		return String.format("%d/%d/%d", month, day, year);  // return text and date dBirthday formatted as birthday
	}
}