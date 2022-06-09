import java.util.*;
public class FinalExam2 {
    //Goldbach's Conjecture
    static boolean checkForPrime(int inputNumber) {
        for (int i = 2; i <= inputNumber/2; i++)
            if (inputNumber % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an even number (6 to 298) and I will represent it as the sum of two prime numbers: ");
        int number = userInput.nextInt();

        if (number > 4 && number < 300 && number % 2 == 0) {
            for (int x = 2; x < number; x++) {
                if (checkForPrime(x)) {
                    if (checkForPrime(number - x)) {
                        System.out.println("\n" + number + " is " + x + " + " + (number - x));
                        break;
                    }
                }
            }
        }else
            System.out.println("\nYou didn't enter an even number between 6 and 298\n\nTry again");
    }
}