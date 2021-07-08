package Java_Prgms1;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read=new Scanner(System.in);
		System.out.println("Enter Year in YYYY format");
		int year = read.nextInt();
		if(year%4==0) {
			if(year%100==0)
			{
				if(year%400==0)
					System.out.println("Year "+year+" is Leap year.");
				else
					System.out.println("Year "+year+" is not Leap year.");
			}
			else
			System.out.println("Year "+year+" is Leap year.");
		}
		else
			System.out.println("Year "+year+" is not Leap year.");

	}

}
