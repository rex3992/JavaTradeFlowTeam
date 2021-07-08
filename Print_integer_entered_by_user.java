package Java_Prgms1;

import java.util.Scanner;

public class Print_integer_entered_by_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("please enter a number: ");		
		int number = reader.nextInt();
		
		System.out.println("You Entered : "+number);
		
	}

}
