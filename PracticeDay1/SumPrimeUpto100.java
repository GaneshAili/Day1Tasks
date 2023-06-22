package PracticeDay1;

public class SumPrimeUpto100 {
	
    public static boolean isPrime(int number) {
    	
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int limit = 100;
        int sum = 0;

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("The sum of prime numbers up to " + limit + " is: " + sum);
    }
}

