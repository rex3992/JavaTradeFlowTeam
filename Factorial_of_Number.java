package Java_Prgms1;

import java.util.Scanner;

public class Factorial_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = read.nextInt();
		int fac =1;
		
		for(int i =1;i<=num;i++) {
			fac = fac*i;
		}
		
		System.out.println("Factorial of "+num+" is "+fac);
		
	}

}
