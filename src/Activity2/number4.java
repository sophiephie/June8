package Activity2;

import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input first number");
		double num1 = kb.nextDouble();
		
		System.out.println("Input 2nd number");
		double num2 = kb.nextDouble();
		
		System.out.println("Input 3rd number");
		double num3 = kb.nextDouble();
		double average = (num1 + num2 + num3)/3;
		
		System.out.println("The average is " + average);
		
		

	}

}
