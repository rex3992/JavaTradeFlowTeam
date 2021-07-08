package Java_Prgms1;

import java.util.Scanner;

public class Charater_Vowel_or_Consonant {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("please a charater: ");		
		char ch = reader.next().charAt(0);
	if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
		System.out.println("Charater '"+ch+"' is a vowel");
	else
		System.out.println("Charater '"+ch+"' is a consonant");
	}

}
