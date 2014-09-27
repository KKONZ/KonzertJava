import java.util.*;

class ReverseString{
	public static void main(String[]args){
		String yourString, reverseString = "";
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a string ");
		yourString = kb.nextLine();
		
		int length = yourString.length();
		
		for(int i = length - 1; i >= 0; i--)
		reverseString= reverseString + yourString.charAt(i);
		System.out.println("your string, " + yourString + " reversed is " + reverseString);
	}
}