package PracticeDay1;

import java.util.Scanner;

public class ReverseNumber {
	
	public void reverse(int number) {
		
		int rev=0,m=0;
		while(number!=0) {
			m=number%10;
			rev = rev * 10 + m;
			number=number/10;
		}
		
		System.out.println("ReverseNumber is: "+rev);
			
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ReverseNumber obj=new ReverseNumber();
		int n=sc.nextInt();
		int[] arr=new int[n];
		if(n<0) {
			System.out.println("Invalid Input");
		}
		obj.reverse(n);
	}

}
