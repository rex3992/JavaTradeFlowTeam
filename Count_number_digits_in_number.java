package Java_Prgms1;

import java.util.Scanner;

public class Count_number_digits_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = read.nextInt();
		int num1 = num;
		int count = 0;
		int sum = 0;
		int rev = 0;
		while(num>0)
		{
			count++;
			sum =sum +num%10;
			rev = rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("Number of digits in "+num1+" is "+count+" and its sum of digits is "+sum+" and its reverse is "+rev);
	}

}
