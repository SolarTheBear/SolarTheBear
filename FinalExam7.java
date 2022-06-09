import java.util.*;
public class FinalExam7 {
    //Palindromic primes
    static boolean checkForPrime(int inputNumber) {
        for (int i = 2; i <= inputNumber/2; i++)
            if (inputNumber % i == 0)
                return false;
        return true;
    }
    static boolean palindromeChecker(int num) {
        int a = num;
        while (a >= 10)
            a /= 10;
        int b = num % 10;
        return a == b;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program finds all the palindromic prime numbers between a given range.\n");
        System.out.print("Enter the minimum number (1 to 999): ");
        int min = userInput.nextInt();
        System.out.print("Enter the maximum number (1 to 999): ");
        int max = userInput.nextInt();

        if (min < max && min > 0 && min < 1000 && max < 1000) {
            System.out.println();
            for (int x = min; x <= max; x++) {
                if (checkForPrime(x) && palindromeChecker(x)) {
                    System.out.print(x + ", ");
                }
            }
            System.out.println("\b\b");
        }
        if (min > max) {
            System.out.println("\nThe minimum value is greater than the maximum value");
            if (min < 1 || min > 999 || max < 1)
                System.out.println("\nSome values aren't within the specified range\n\nTry Again");
        }
        if (min < 1 || min > 999 || max > 999)
            System.out.println("\nSome values aren't within the specified range\n\nTry Again");
    }
}
