package Java_Prgms1;

import java.util.Scanner;

public class Char_Alphabet_or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		System.out.println("Enter a Charater");
		char ch = read.next().charAt(0);
		
		int ascii = ch;
		
		if((ascii>64 && ascii<92)||(ascii>96 && ascii<124))
			System.out.println("Character '"+ch+"' is an alphabet");
		else
			System.out.println("Character '"+ch+"' is not an alphabet");
	}

}
