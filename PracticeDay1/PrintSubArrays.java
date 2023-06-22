package PracticeDay1;


import java.util.Scanner;

public class PrintSubArrays {
	
	static void printAllSubArray(int[] array) {
		
		for (int i = 0; i < array.length; i++)
        {
            int sum = 0;
 
            for (int j = i; j < array.length; j++)
            {
     
                sum += array[j];
                
                if (sum == 0) {
                	System.out.print("Sub Array is: "+"[");
                    for(int k=i;k<=j;k++) {
                    	System.out.print(" "+array[k]);
                    }
                    System.out.print("]");
                }
            }
            System.out.println();
        }
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n=sc.nextInt();
		int[] array=new int[n];
		if(n<0) {
			System.out.println("Invalid Input");
		}else {
			for(int i=0;i<n;i++) {
				array[i]=sc.nextInt();
			}
			printAllSubArray(array);
		}
		
		
	}

}
