/* Java program to create Dogs subclass of superclass Animals (example of inheritance)
* This uses the class fields name and favFood from Animals and sets initial values 
* for the fields.  Also create subclass method exercise which overrides Animals superclass 
* exercise method.  We also add field favToy and set constructor for Dogs.
*
*   Author: Karl Elmore
*   Program: Dogs.java
*/
public class Dogs extends Animals { // create subclass Dogs and inherit fields from Animals superclass.
	public String favToy = "Bone";  // create String variable favToy and initialize value to Bone
	public void playWith() {  // create method playWith
		System.out.println("Awesome" + favToy);  // Print Text and variables to console
	}
	public void exercise(){ //create method exercise
		System.out.println(this.getName() + " stalks around"); // Print Text and variables to console
	}
	public String getToy(){ // gets the value of favToy
		return this.favToy;  // returns the value of favToy
	}
	public Dogs() {  // generic constructor
		
	}
	public Birthday dBirthday;  // Create birthday as field for class animals
	public Dogs(String name, String favFood , Birthday bDate, String favToy) {  // set up constructor with fields name, favFood and favToy
		super(name, favFood, bDate);  // constructor references Animals super class with fields name and favFood
		dBirthday = bDate;  // return text and date dBirthday formatted as birthday
		this.favToy = favToy; // Define favToy and set value equal to passed value of favToy
	}
}