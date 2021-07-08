package Java_Prgms1;

import java.util.Scanner;

public class Fib_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number until which the fib series has to be displayed");
		int num = read.nextInt();
		
		int fib1 =1;
		int fib2 =1;
		int t;
		while(fib1<num) {
			System.out.println(fib1);
			t=fib2+fib1;
			fib1=fib2;
			fib2=t;
		}
			
	}

}
