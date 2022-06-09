import java.util.*;
import static java.lang.Math.*;
public class FinalExam4 {
    //2D Treasure Hunting
    //This was my assignment
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are to guess a hidden treasure's location. You only get 10 tries.");

        int x_value = (int) Math.floor(Math.random() * 10 + 1);
        int y_value = (int) Math.floor(Math.random() * 10 + 1);

        int[] previous = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter an x coordinate (1 to 10): ");
            int x = userInput.nextInt();
            System.out.print("Enter a y coordinate (1 to 10): ");
            int y = userInput.nextInt();

            int taxicab = abs(x - x_value) + abs(y - y_value);
            if (taxicab == 0) {
                System.out.println("You have found the treasure!");
                System.out.println("\nIt took you " + (i + 1) + " tries.");
                break;
            }
            else if (taxicab <= 3)
                System.out.println("The treasure is very close");
            else if (taxicab <= 6)
                System.out.println("The treasure is somewhat close");
            else
                System.out.println("The treasure is not close");

            previous[i] = taxicab;

            if (i != 0) {
                if (previous[i - 1] == taxicab)
                    System.out.println("The same distance");
                if (previous[i - 1] > taxicab)
                    System.out.println("You are closer");
                if (previous[i - 1] < taxicab)
                    System.out.println("You are farther");
            }

            if (i == 9) {
                System.out.println("\nYou ran out of guesses");
                System.out.println("\nThe treasure was at (" + x_value + ", " + y_value + ")");
            }
        }
    }
}