package PracticeDay1;


public class SumTarget {
    public static void findPairs(int[] array, int targetSum) {
        System.out.println("Pairs with sum " + targetSum + ":");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    System.out.println(array[i] + " + " + array[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 5, 9, 10, 1};
        int target = 9;

        findPairs(numbers, target);
    }
}
