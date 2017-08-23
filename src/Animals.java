/* Java program to create Animals superclass and Dogs subclass (example of inheritance)
 * This creates the class fields name and favFood and accepts the values when called
 *
*   Author: Karl Elmore
*   Program: Animals.java
*/

public class Animals { // create class animals
	private String name = "Animal"; // Private means only the animal class has access to this. 
	// initialize name field equal to Animal
	public String favFood = "Food";  // public means all access. Initialize value of favFood field equal to Food
	// protected method can not be changed by any subclasses
	public Birthday dBirthday;  // Create birthday as field for class animals
	protected final void changeName(String newName) { // protected final means this method cannot be changed by 
	//	any subclasses. Create method changeName with string variable newName
		this.name = newName; //  Set string variable name equal to newName
	}
	protected final String getName() { // get value of name and return the value
		return this.name; // return value of name
	}
	public void eat() { // create method eat
		System.out.println("Cool" + favFood);  // Print Text and variables to console
	}
	public void exercise() {  // create method exercise
		System.out.println(this.name + "walks around");  // Print Text and variables to console
	}
	public Animals() { // generic constructor for the Animals class
		
	}
	public Animals(String name, String favFood, Birthday bDate) {  // Construct for the Animals class to accept and set field values
		this.changeName(name); // set string variable changeName equal to passed value of name
		this.favFood = favFood; // set string variable favFood equal to passed value of favFood
		dBirthday = bDate;  // set variable dBirthday equal to bDate
	}
	public String toString() {  // create method toString
		return String.format("My birthday is %s", dBirthday);  // return text and date dBirthday formatted as birthday
	}
}