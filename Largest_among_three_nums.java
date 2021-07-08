package Java_Prgms1;

import java.util.Scanner;

public class Largest_among_three_nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {40,30,20};
		int max = a[0];
		for(int i=1;i<3;i++) {
			if(max<a[i])
					max=a[i];
		}
		System.out.println("Max Number is " + max);					
	}

}
