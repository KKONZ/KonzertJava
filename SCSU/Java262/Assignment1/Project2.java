import javax.swing.JOptionPane; // imports java package

class Project2{
	public static void main(Strin[]args){
	// prompts user to enter an initial
	String yourFirstInitial = JOptionPane.showInputDialog(
	"Please enter your first initial.");
	
	String output = "Your first initial is " + yourFirstInitial;
	JOptionPane.showMessageDialog(null. output, "your first initial",
	JOptionPane.INFORMATION_MESSAGE);// prints initial back to user
	}
}