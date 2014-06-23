
import java.util.*;

class DollarsToYen
{
    public static final int MAX_DEPOSITS = 100;
    public static final float DOLLAR_TO_YEN = 0.098f;
    
    // read number of Dollars in each account from the keyboard
    void readDollars(float[] dollars, int count)
    {
        Scanner kb= new Scanner(System.in);
        for(int j = 0; j < count; j++)
        {
            System.out.print("Enter the deposit amount(dollars) : $");
            dollars[j]    = kb.nextInt();
        }
    }
    // Convert Dollars to Yen
    void dollarsToYen(float dollars[],float yen[],int count)

  /*  
This code has an incorrect conversion, from original assignment submission!

  {
        for (int j = 0; j < count; j++)
        yen[j] = dollars[j]/DOLLAR_TO_YEN) ;
    }
   */
 
// correct conversion
{
        for (int j = 0; j < count; j++)
        yen[j] = dollars[j]  * DOLLAR_TO_YEN * 1000;
    }
 
    // Display the amount in each account in both Dollars and Yen
    void displayData(float dollars[],float yen[],int count)
    {
        for(int j = 0; j < count; j++)
        {
            System.out.println("\nAccount ["+(j+1)+"] :");
            System.out.println("\t"+dollars[j]+" dollars");
            System.out.println("\t"+yen[j]+" yen");
        }
        System.out.println();
    }
    
    public static void main(String[]args)
    {
        int num;  
        float[] dollars = new float[MAX_DEPOSITS]; //Dollars
        float[] yen = new float[MAX_DEPOSITS]; // Yen
        
        
        Scanner kb = new Scanner(System.in);
        DollarsToYen deposit = new DollarsToYen();
        
        // prompt the user for the number of deposits
        System.out.print("Enter the number of deposits: ");
        num = kb.nextInt();
        
        // Read The amount in each deposit
        deposit.readDollars(dollars, num);
        
        // Convert Dollars to Yen.
        deposit.dollarsToYen(dollars, yen, num);
        
        // Display the amount in each deposit
        deposit.displayData(dollars, yen, num);
    }
}
