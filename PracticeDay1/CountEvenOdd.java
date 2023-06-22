package PracticeDay1;

import java.util.Scanner;

public class CountEvenOdd {
	
	public static void main(String[] args) {
		
		int even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length is: ");
		int n=sc.nextInt();
		System.out.println("Enter the array values is: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				System.out.println("Invalid input");
				break;
			}
			if(arr[i]%2==0) {
				even+=arr[i];
			}
			else {
				odd+=arr[i];
			}
		}
		System.out.println("sum of even number is: "+even);
		
		System.out.println("sum of odd number is: "+odd);
		
	}

}
