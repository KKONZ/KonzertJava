
import java.util.Scanner;

public class Tax1 {
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter filing status
		System.out.print(
			"(0-single filer, 1-married jointly,\n" + 
			"2-married sperately, 3-head of household)\n" +
					"Enter filing status: ");
		int Stat = input.nextInt();
		
		// Prompt the user to enter taxable income
		System.out.print("How much are you claiming as earned income?: ");
		double inc = input.nextDouble();
		
		// Compute and display the result
		System.out.println("Your tax amount is " +
		(int)(compuT(stat, inc) * 100) / 100.0);
	}
	
	public static double compuT(int stat, double inc){
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		
		int[][] brackets = {
			{8350, 33950, 88250, 171550, 372950}, // single filer
			{16700, 67900, 137050, 20885, 372950}, // Married jointly
			{8350, 33950, 68525, 104425, 186475}, // Married seperately
			{11950, 45500, 117450, 190200, 372950} // Head of household
		};
		
		double tax =0; // Tax to be computed
		
		// Compute tax in the first bracket
		if (inc <= brackets[stat][0])
			return tax = inc * rates[0]; // Done
		else
			tax = brackets[status][0] * rates[0];
		
		//checks for brackets 2, 3, 4, 5
		for (int i = 1; i < brackets[0].length; i++){
			if (income > brackets[status][i])
				tax += (brackets[status][i] - brackets[status][i - 1]) * 
						rates[i];
			else{
				tax += (income - brackets[status][i - 1]) * rates[i];
				return tax; // Done
				}
			}
			
		
			// Compute tax in the last (i.e, 6th) bracket
			return tax += (income -brackets[status][4] * rates[5]);
	}
}
