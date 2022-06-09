import java.util.*;
public class FinalExam14 {
    //Colored Triangles
    //Surprisingly difficult
    static char[] rgb = new char[3]; static int i = 0;
    static {rgb[0] = 'R'; rgb[1] = 'G'; rgb[2] = 'B';}

    static char rgbInterpreter (char one, char two) {
        if (one == two)
            return one;
        for (i = 0; i < 3; i++)
            if (one != rgb[i] && two != rgb[i])
                break;
        return rgb[i];
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program prints a triangle comprised of three colors (Red, Green, and Blue)." +
                "\nIf the above two colors are different, the missing color is fulfilled on the succeeding row." +
                "\nIf the above two colors are the same, that pattern is followed on the succeeding row.");
        System.out.print("\nEnter an RGB pattern for the first row (no spaces): ");
        String input = userInput.next().toUpperCase();

        System.out.println("\n" + input);

        char[] prevCharacters = new char[input.length() + 100];

        for (int x = 0; x < input.length(); x++) //sets up prevCharacters as the first row
            prevCharacters[x] = input.charAt(x);

        for (int z = 1; z <= input.length() - 1; z++) {//loops the main loop so that it prints input.length() amount of times
            for (int y = 0; y < input.length() - z; y++) { //changes prevCharacters to the current row and prints it
                prevCharacters[y] = rgbInterpreter(prevCharacters[y], prevCharacters[y + 1]);
                System.out.print(prevCharacters[y]);
            }
            System.out.println();
        }
    }
}