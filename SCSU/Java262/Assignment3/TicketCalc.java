import java.util.*;

class TicketCalc
{
    public static void main(String[]args)
    {
    Scanner kb = new Scanner(System.in);
    /*
        Declare the fine amounts for each tier of ticket,
        note that the variable are listed as set amounts.
    */
    final int MAXFINE = 150;
    final int TIER3 = 75;
    final int TIER2 = 40;
    final int TIER1 = 15;
    
    /* 
        Prompts the user to enter how fast they were going 
        and to save that amount in the variable yourSpeed.
    */
    
    System.out.print("Enter how many miles per hour you were driving over the speed limit? ");
    int yourSpeed = kb.nextInt();
    
    // Use conditionals to find how much the ticket will be.
    if(yourSpeed >= 96)
    System.out.println("You have a court date scheduled 10 days after ticket was issued.");
    else if(yourSpeed >= 91)
    System.out.println("You were driving " + yourSpeed + ", your ticket amount is: $" + MAXFINE);
    else if(yourSpeed >= 86)
    System.out.println("You were driving " + yourSpeed + ", your ticket amount is: $" + TIER3);
    else if(yourSpeed >= 80)
    System.out.println("You were driving " + yourSpeed + ", your ticket amount is: $" + TIER2);
    else if(yourSpeed >= 71)
    System.out.println("You were driving " + yourSpeed + ", your ticket amount is: $" + TIER1);
    else
    System.out.println("Please contact the courthouse to find status of ticket.");
    }
}
