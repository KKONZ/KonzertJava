// Very simple input output java file
import java.util.*;

public class Shoe{
	public static void main(String[]args){
		int shoes;
		Scanner kb = new Scanner(System.in);
		System.out.println("How many shoes do you have? ");
		shoes = kb.nextInt();
		System.out.println("You have " + shoes + " Shoes!");
	}
}
