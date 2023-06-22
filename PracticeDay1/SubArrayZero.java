package PracticeDay1;

class SubArrayZero
{

    public static void printAllSubarrays(int[] nums)
    {
    	int sum = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
 
            for (int j = i; j < nums.length; j++)
            {
                sum += nums[j];
            }
            if (sum == 0) {
                System.out.println("true");
            }
        }
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
 
        printAllSubarrays(nums);
    }
}