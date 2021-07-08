package Java_Prgms1;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = reader.nextInt();
		
		if(num%2==0)
			System.out.println("Number "+num+" is even number");
		else if(num%2==1)
			System.out.println("Number "+num+" is odd number");

	}

}
