/* Java program to Test Animals and Dogs programs. Test the example of inheritance.
 * First we print the values of class fields name and favFood from Animals superclass
 * Then we send values for subclass fields name, favFood, and favToy to Dogs. There are
 * two examples: Skip and labrador.  Then we call the exercise method which is in Animals 
 * super class and Dogs subclass. The Dogs subclass overrides Animals superclass 
 * exercise method.  
 *
*   Author: Karl Elmore
*   Program: TestComposition.java
*/
import java.util.Scanner;

public class TestComposition {  // create class TestComposition
	public static void main(String[] args) { // create main method
		String done = "No";  // initialize string variable done to No
	    while (done.equalsIgnoreCase("No")) {  // Repeat loop until statement is false, done is equal to Yes
		
		    Scanner in = new Scanner(System.in);  // Reads the string input from the user
		    System.out.println("Enter information about your dogs.");  // Prints text to the console
	        System.out.print("What is the name of your Dog? ");  // Prints text to the console
	        String dName = in.nextLine();  // Stores the user input in the variable dName
	    	Scanner in2 = new Scanner(System.in);  // Reads the string input from the user
	        System.out.print("What is your Dog's favorite food? ");  // Prints text to the console
	        String dFavFood = in2.nextLine();  // Stores the user input in the variable dFavFood
	    	Scanner in3 = new Scanner(System.in);  // Reads the string input from the user
	        System.out.print("What is your Dog's favorite toy? ");  // Prints text to the console
	        String dFavToy = in3.nextLine();  // Stores the user input in the variable dFavToy
	    	Scanner in4 = new Scanner(System.in);  // Reads the string input from the user
	        System.out.print("What month was your Dog born and I will tell you your zodiac sign? (January - December) ");  // Prints text to the console
	        String dBirthMonth = in4.nextLine();  // Stores the user input in the variable dBirthMonth	   
	        Birthday BirthObject = new Birthday(3,5,6);  // Create object Birthobject and set value equal to Birthday by calling
	        // Birthday program and send month, day, year parameters
        	
	    	Dogs dInfo = new Dogs(dName, dFavFood, BirthObject, dFavToy);  // Sends data to Dogs subclass and executes program
	    	System.out.println();  // Print blank line to console
	    	System.out.println("This data is from the Dogs subclass which I changed");  // Print Text to console
	    	System.out.println("My name is " + dInfo.getName());  // Print Text and variables to console  
	    	System.out.println("My favorite food is " + dInfo.favFood);  // Print Text and variables to console
	    	System.out.println("My favorite toy is a " + dInfo.favToy);  // Print Text and variables to console
			System.out.println("Bithday is an object that is my example of composition"); // Print Text to console
	    	System.out.printf("My birthday is %s", BirthObject);  // Print text and variable BirthObject to console
	    	System.out.println();  // Print blank line to console
	    
	        // Receive dayofWeekArg to determine case: work day or weekend.  If valid day Monday through Sunday then
	        // print type of day: work day or weekend else print error message.	

	        String zodiacSign;  // Create string variable zodiacSign
	        switch (dBirthMonth) {  // allows dBirthMonth to be tested for equality against a list of values: 
	        		                // January through December. Each value is called a case, and the variable being 
	        		                // switched on is checked for each case. Based on Month determine your dog's zodiac sign
	            case "January":  // Check if case dBirthMonth is January, if true execute following statements
	            	System.out.println(" Before or equal to the 19th is Capricon after the 19th is Aquarius"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "February":  // Check if case dBirthMonth is February, if true execute following statements
	            	System.out.println(" Before or equal to the 18th is Aquarius after the 18th is Pisces"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "March":  // Check if case dBirthMonth is March, if true execute following statements
	            	System.out.println(" Before or equal to the 20th is Pisces after the 20th is Aries"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "April":  // Check if case dBirthMonth is April, if true execute following statements
	            	System.out.println(" Before or equal to the 19th is Aries after the 19th is Taurus"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "May":  // Check if case dBirthMonth is May, if true execute following statements
	            	System.out.println(" Before or equal to the 20th is Taurus after the 20th is Gemini"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "June":  // Check if case dBirthMonth is June, if true execute following statements
	            	System.out.println(" Before or equal to the 20th is Gemini after the 20th is Cancer"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "July":  // Check if case is dBirthMonth is July, if true execute following statements
	            	System.out.println(" Before or equal to the 22nd is Cancer after the 22nd is Leo"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "August":  // Check if case is dBirthMonth is August, if true execute following statements
	            	System.out.println(" Before or equal to the 22nd is Leo after the 22nd is Virgo"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "September":  // Check if case is dBirthMonth is September, if true execute following statements
	            	System.out.println(" Before or equal to the 22nd is Virgo after the 22nd is Libra"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "October":  // Check if case is dBirthMonth is October, if true execute following statements
	            	System.out.println(" Before or equal to the 22nd is Libra after the 22nd is Scorpio"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "November":  // Check if case is dBirthMonth is November, if true execute following statements
	            	System.out.println(" Before or equal to the 21st is Scorpio after the 21st is Sagittarius"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            case "December":  // Check if case is dBirthMonth is December, if true execute following statements
	            	System.out.println(" Before or equal to the 21st is Sagittarius after the 21st is Capricorn"); // Prints text to the console
	        		break;  // Exit the enclosing switch for your case
	            default:  // If the value of dayOfWeekArg is none of the above then execute following statements
	        		throw new IllegalArgumentException("Invalid birth month: " + dBirthMonth);  // Throw an 
	           // print exception message and value of dBirthMonth to the console if no case values are valid
	        		     }
	    	System.out.println(" Are you Done: Yes or No? ");  // Prints text to the console
	        Scanner input = new Scanner(System.in);  // Reads the integer input from the user
	        done = input.nextLine();  // Stores the user input in the variable done   
	    }
	    
	    Animals myAnimal = new Animals();  // create animals object to reference Animals superclass
		System.out.println("This data is from the Animals super class which I inherit"); // Print Text to console
		System.out.println(myAnimal.getName()); // Print value of variable name to console from Animals superclass
		System.out.println(myAnimal.favFood); // Print value of variable favFood to console  from Animals superclass
		Birthday BirthObject2 = new Birthday(4,7,8);  // Create object Birthobject2 and set value equal to Birthday by calling
        // Birthday program and send month, day, year parameters
		Animals labrador = new Dogs("Labrador", "Chicken", BirthObject2 , "Frisbee");  // Sends data to Dogs subclass and executes program
		acceptAnimal(labrador);  // call method acceptAnimal and pass labrador information
		System.out.println("Bithday is an object that is my example of composition"); // Print Text to console
		System.out.printf("My birthday is %s", BirthObject2);  // Print text and variable BirthObject2 to console
    	System.out.println();  // Print blank line to console
	}
	public static void acceptAnimal(Animals randAnimal){  // create acceptAnimal method and references Animals superclass
		System.out.println("This is an example of inheritance and polymorphism"); // Print Text to console
		System.out.println(); // Print blank line to console
		System.out.println("My name is " + randAnimal.getName()); // Print Text and variables to console
		System.out.println("My favorite food is " + randAnimal.favFood);  // Print Text and variables to console
		System.out.println(); // Print blank line to console
		
		// Also example of Polymorphism. Java says is this an animal and part of the super class (yes)
		// Then Java checks if this is part of the subclass Dogs (yes). So Java will use the exercise
		// exercise method from the subclass Dogs instead of the exercise method from the super class Animals
		// so you return stalks around instead of walks around.
		randAnimal.exercise();  // call exercise method in Dogs subclass
		
		System.out.println("My favorite toy is " + ((Dogs)randAnimal).favToy); // Print Text and variables to console
		// have to reference Dogs subclass because Java will only look in Animals superclass and would not find favToy
		
		if (randAnimal instanceof Animals) {  // if random animal is an instance of Animals then execute statement
			System.out.println(randAnimal.getName() + " is a Dog");  // Print text and variable Name for random animal
		    }
	}
	
}