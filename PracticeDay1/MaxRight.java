package PracticeDay1;

public class MaxRight {
    public static void printLeaders(int[] array) {
        System.out.println("Leaders in the array:");

        int maxRight = array[array.length - 1];
        System.out.println(maxRight);

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] > maxRight) {
                maxRight = array[i];
                System.out.println(maxRight);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {16, 17, 4, 3, 5, 2};

        printLeaders(numbers);
    }
}

