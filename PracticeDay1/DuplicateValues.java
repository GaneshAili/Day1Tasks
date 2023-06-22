package PracticeDay1;

public class DuplicateValues {
    public static void findDuplicates(int[] array) {
        System.out.println("Duplicate values:");

        // Iterate over each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the element has occurred previously
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3};

        findDuplicates(numbers);
    }
}
