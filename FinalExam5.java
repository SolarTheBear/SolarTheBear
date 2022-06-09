import java.util.*;
public class FinalExam5 {
    //Emirps
    static boolean checkForPrime(int inputNumber) {
        for (int i = 2; i <= inputNumber/2; i++)
            if (inputNumber % i == 0)
                return false;
        return true;
    }
    static int reverse(int num) {
        int reversed = 0;
        for(;num != 0; num /= 10)
            reversed = reversed * 10 + (num % 10);
        return reversed;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("This code finds all the prime numbers that are also prime backwards within a given range");
        System.out.print("\nEnter a minimum value (1 to 999): ");
        int min = userInput.nextInt();
        System.out.print("Enter a maximum value (1 to 999): ");
        int max = userInput.nextInt();

        if (min < max && min > 0 && min < 1000 && max < 1000) {
            System.out.println();
            for (int x = min; x <= max; x++) {
                if (checkForPrime(x) && checkForPrime(reverse(x)))
                    System.out.print(x + ", ");
            }
            System.out.println("\b\b.");
        }
        if (min > max) {
            System.out.println("\nThe minimum value is greater than the maximum value");
            if (min < 1 || min > 999 || max < 1)
                System.out.println("\nThe values aren't within the specified range\n\nTry Again");
        }
        if (min < 1 || min > 999 || max > 999)
            System.out.println("\nSome values aren't within the specified range\n\nTry Again");
    }
}