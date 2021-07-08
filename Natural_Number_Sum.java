package Java_Prgms1;

import java.util.Scanner;

public class Natural_Number_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = read.nextInt();
		int sum = 0;
		for(int i =1;i<=num;i++) {
			sum = sum+i;
		}
		
		System.out.println("Sum of Natuaral Numbers till "+num+" is "+sum);

	}

}
