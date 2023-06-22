package PracticeDay1;

import java.util.Scanner;

public class AddDigits {
	
	public void addDigit(int n) {
		int add=0,m=0;
		for(int i=0;i<n;i++) {
			m=n%10;
			add+=m;
			n=n/10;
		}
		System.out.println("add digits value is: "+add);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: 5");
		int n=sc.nextInt();
		AddDigits obj=new AddDigits();
		if(n<0) {
			System.out.println("Invalid Input");
		}
		obj.addDigit(n);
	}

}
