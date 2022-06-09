import java.util.*;
public class FinalExam8 {
    //Distinct Prime Factorization
    static boolean checkForPrime(int inputNumber) {
        for (int i = 2; i <= inputNumber/2; i++)
            if (inputNumber % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program calculates the distinct prime factors of the user input.\n");
        System.out.println("Enter a number (4 to 999) and I'll show you its distinct prime factors: ");
        int input = userInput.nextInt();

        if (input > 3 && input < 1000) {
            if (!checkForPrime(input)) {
                System.out.println();
                for (int x = 2; x <= input; x++) {
                    if (input % x == 0) {
                        System.out.print(x + ", ");
                        input /= x;
                    }
                }
                System.out.println("\b\b");
            } else System.out.println("\n" + input + " is prime, so it has no other prime factor other than itself.");
        } else System.out.println("\nYou didn't enter a number within the given range\n\nTry Again");
    }
}