import java.util.*;

class HarmSum 
{
    double harmCheck(int n)
    {
        double result = 0.0;
        if(n ==1)
        return n;
        
        else
        {
        result = + 1.0 / n + harmCheck(n -1);
        return result;
        }
    }
    public static void main(String[]args)
    {
    Scanner kb = new Scanner(System.in);
    HarmSum myHarmCheck = new HarmSum();
    
    System.out.print("Enter the number of terms in the series: ");
    int n = kb.nextInt();
    
    System.out.println("The sum of the harmonic series is: " + myHarmCheck.harmCheck(n));
    }
}
