package Java_Prgms1;

import java.util.Scanner;

public class ASCUII_of_Charater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("please a charater: ");		
		char ch = reader.next().charAt(0);
		
		int ascii = ch;
		
		System.out.println("Ascii value of '"+ch+"' is "+ascii);
		
	}

}
