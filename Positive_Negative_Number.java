package Java_Prgms1;

import java.util.Scanner;

public class Positive_Negative_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number ");
		
		float num = read.nextFloat();
		
		if(num==0)
			System.out.println("Number is Zero, i.e. neither positive nor negative");
		else if(num>0)
			System.out.println("Number "+num+" is positive");
		if(num<0)
			System.out.println("Number "+num+" is negative");

	}
}
