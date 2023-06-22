package PracticeDay1;

public class MajorityElement {
    public static int findMajorityElement(int[] array) {
        int majorityElement = -1;
        int majorityCount = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (count > majorityCount) {
                majorityElement = array[i];
                break;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
    	
        int[] numbers = {1, 2, 3, 2, 2, 4, 2, 2, 5};

        int majorityElement = findMajorityElement(numbers);

        if (majorityElement != -1) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
