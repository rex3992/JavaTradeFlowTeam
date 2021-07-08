package Java_Prgms1;

import java.util.Scanner;

public class Swap_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("please two numbers: ");
		
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		
		System.out.println("Before Swap Num1 = "+num1+" Num2 = "+num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("After Swap Num1 = "+num1+" Num2 = "+num2);
		
	}

}
