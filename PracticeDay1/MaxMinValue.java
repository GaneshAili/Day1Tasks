package PracticeDay1;

import java.util.*;

public class MaxMinValue
{
  public static void main(String[] args)
  {
	   Scanner sc = new Scanner(System.in);
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   int min=Integer.MAX_VALUE;
		   int max=Integer.MIN_VALUE;
		   for(int i=0;i<=9;i++)
		   { 
		     if(my_array[i]<min)
		       {
		       min=my_array[i];
		       }
		     if(my_array[i]>max)
		     {
		       max=my_array[i];
		     }
		   }
		   System.out.println("Maximum element is "+max);
		   System.out.println("Minimum element is "+min);
	}
}