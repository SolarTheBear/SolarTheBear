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

        System.out.println("This program finds the first palindromic prime number greater than the user input.\n");
        System.out.print("Enter a number (1 to 99): ");
        int input = userInput.nextInt();

        if (input > 0 && input < 100){
            for (int x = input + 1; true; x++) {
                if (checkForPrime(x) && palindromeChecker(x)) {
                    System.out.print("\n" + x + "\n");
                    break;
                }
            }
        } else System.out.println("\nYou didn't enter a number within the given range\n\nTry Again");
    }
}