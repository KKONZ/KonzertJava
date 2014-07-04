
import java.util.*;

public class BinarySearch {
  
  public static void main(String[]args){
  

	int target, myList[]; 
	Scanner kb = new Scanner(System.in);
    System.out.println("How big is your array?");
    int x = kb.nextInt();
	myList = new int[x];
	
	
    System.out.println("Enter " + x + " integers");
	
    for(int i = 0; i < x; i++)
      myList[i] = kb.nextInt();
      System.out.println("What value are you looking for?");
      target = kb.nextInt();
	  int low = 0;
	  int high = x - 1;
	  int mid = (low + high) / 2;

    while (low <= high) {
      if (target > myList[mid])
        high = mid + 1;
      else if (target == myList[mid]){
        System.out.println(target + " found at " + (mid + 1) + ".");
		break;
      }
      else
	    low = mid - 1;
        mid = (low + high)/2;
    }
	if(low > high)
	System.out.println(target + " was not found ");
  }  
}
