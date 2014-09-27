import java.util.*;

public ScannerDemo{
  public static void main(String[]args){
    int n1, n2;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter two whole numbers");
    System.out.println("seperated by one or more spaces: ");
    n1 = kb.nextInt();
    n2 = kb.nextInt();
    System.out.println("You entered " + n1 + " and " + n2);
    
    System.out.println("Next enter two numbers.");
    System.out.println("A decimal point is ok.");
    
    double d1, d2;
    d1 = kb.nextDouble();
    d2 = kb.nextDouble();
    System.out.println("You entered " + n1 " and " + n2);
    System.out.println("Enter two words: ");
    
    String s1, s2;
    s1 = kb.next();
    s2 = kb.next();
    System.our.println("You entered\"" + s1 + "\"  and \"" + s2 + "\"");
    
    s1 = kb.nextLine();
    System.out.println("Next enter a line of text: ");
    s1 = kb.nextLine();
    System.out.println("You entered: \"" + s1 + "\"");
  }
}
