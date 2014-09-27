import java.io.*;
import java.util.*;

public class KeyboardReaderExample
{
  public static void main(String[]args) throws java.io.IOException
  {
    String1;
    String2;
    
    // double num1, num2, product;
    
    //set up the buffered reader to read from the keyboard
    bufferReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a line of code: ");
    s1 = br.readLine();
    
    System.outprintln();
    System.out.println("The line has " + s1.length() + " characters. ");
    System.out.println();
    System.out.println("Breaking line into tokens we get: ");
    int numTokens = 0;
    SteingTokenizer st = StringTokenizer(s1);
    
    while(st.hasMoreTokens()){
    s2 = st.nextToken();
    numTokens++;
    System.out.println(" Token " + numToken + "is: " + s2);
    }
  }
}
