package GItHub;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) { 
		// declaration 
		int Counter;  // to stop the program from running
		
		// loop
		do { 
			double sum = 0; 
			double list[] = new double[3];
	         Scanner in = new Scanner(System.in);
	            System.out.println("Enter  3 numbers to be added: ");
			for (double i = 0; i < 3; i++) {   // loop until i reaches 3
				//list[i] = in.nextDouble();			// wrong 
			      list[(int)i] = in.nextDouble();
			//sum += list[i];    // wrong
			      sum += list[(int)i];
		} 
			System.out.println("sum = " + sum + "\n");
			 
			 System.out.println("Enter 1 to continue or any value to exit........");
	            Counter = in.nextInt();
		}
		//while (true);   // this is need to close the do while looop 
			while (Counter == 1); // counter to stop the program
			System.out.println("Thank you have a wounderful day");
	}
	

}
