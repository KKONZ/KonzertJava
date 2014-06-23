import java.util.*; // import java package

class Project1{
	public static void main(String[]args){
	char yourFirstInitial: // create a variable character
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Please enter your first initial.");// prompts the user to enter an initial
	yourFirstInitial = keyboard.nextLine().charAt(0);
	// concatenate string output
	System.out.println("Your first initial is " + yourFirstInitial + ".");
	}
}