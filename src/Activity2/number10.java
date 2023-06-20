package Activity2;

import java.util.Scanner;

public class number10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number");
		int num1 = kb.nextInt();
		
		System.out.println("Input another number");
		int num2 = kb.nextInt();
		
		int swap_num;
		
		swap_num = num1;
		num1 = num2;
		num2 = swap_num;
		
		
		System.out.println("First input is now " + num1);
		System.out.println("Second input is now " + num2);

	}

}
