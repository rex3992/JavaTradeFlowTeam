package Java_Prgms1;

import java.util.Scanner;

public class Multiply_Floating_Number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("please enter two float number: ");		
		float num1 = reader.nextFloat();
		float num2 = reader.nextFloat();
		
		System.out.println("Multiplication of "+num1+" and "+num2+" = "+(num1*num2));
	}

}
