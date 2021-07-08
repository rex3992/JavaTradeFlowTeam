package Java_Prgms1;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = read.nextInt();
		System.out.println("Table for "+num+"\n");
		for(int i=1;i<=10;i++)
			System.out.println(num+" X "+i+" = "+num*i);

	}

}
