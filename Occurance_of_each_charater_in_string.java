package Java_Prgms1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance_of_each_charater_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read =new Scanner(System.in);
		System.out.println("Enter a String");
		String Main = read.next();
		
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>() ;
		char[] ch = Main.toCharArray();
		
		for(char c: ch) {
			if(hs.containsKey(c))
				hs.put(c, hs.get(c)+1);
			else
				hs.put(c, 1);
		}
		
		for(Map.Entry entry : hs.entrySet()) {
			System.out.println(entry.getKey() + " occurs "+entry.getValue());
		}
		
		
	}

}
