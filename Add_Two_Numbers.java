package Java_Prgms1;

import java.util.Scanner;

public class Add_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("please enter two number: ");		
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		
		System.out.println("Addition of "+num1+" and "+num2+" = "+(num1+num2));
	}

}
