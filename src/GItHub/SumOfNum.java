package GItHub;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) { 
		// declaration 
		int Counter; 
		
		// loop
		do { 
			double sum = 0; 
			double list[] = new double[3];
	         Scanner in = new Scanner(System.in);
	            System.out.println("Enter  3 numbers to be added: ");
			for (double i = 0; i < 3; i++) {   // loop until i reaches 3
				//list[i] = in.nextDouble();
			      list[(int)i] = in.nextDouble();
			//sum += list[i];
			      sum += list[(int)i];
		} 
			
			
			
		}
		while (true);   // this is need to close the do while looop 
	}
	

}
