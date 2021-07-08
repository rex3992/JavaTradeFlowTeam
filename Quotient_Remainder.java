package Java_Prgms1;

import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("please dividend and its divisor to  get Remainder and Quotient: ");
		
		int num = reader.nextInt();
		int div = reader.nextInt();
		
		int remainder = num%div;
		int quotient = num/div;
		
		System.out.println("Dividend "+num+" divded by "+div+" gives "+quotient+" as quotient and "+remainder+" as remainder");

	}

}
