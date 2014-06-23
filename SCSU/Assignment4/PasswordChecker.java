import java.util.*;

class PasswordChecker
{
    public static void main(String[]args)
    {
        char ch; 
        char fin;
        boolean done= false;
        Scanner kb = new Scanner(System.in);
        
        System.out.println("You have before you a closed door");
        System.out.print("\nPlease enter the password slowly, one letter at a time: \n");
        
        while(!done)// loop to check for 's' followed by 's' // iteration loop
        {
        ch = kb.next().charAt(0);
        if(ch == 'c' && ch != 's')
            {
            fin = kb.next().charAt(0);
            if
            (fin == 's')
            {
            done = true;
            System.out.println("The door opens. Congratulations!");
            }
            }
        }
    }
}
