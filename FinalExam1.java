import java.util.*;
public class FinalExam1 {
    //Fibonacci Letters
    static int first_int;
    static int second_int;
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String[] alphabet = new String[27];
        alphabet[1] = "A";
        alphabet[2] = "B";
        alphabet[3] = "C";
        alphabet[4] = "D";
        alphabet[5] = "E";
        alphabet[6] = "F";
        alphabet[7] = "G";
        alphabet[8] = "H";
        alphabet[9] = "I";
        alphabet[10] = "J";
        alphabet[11] = "K";
        alphabet[12] = "L";
        alphabet[13] = "M";
        alphabet[14] = "N";
        alphabet[15] = "O";
        alphabet[16] = "P";
        alphabet[17] = "Q";
        alphabet[18] = "R";
        alphabet[19] = "S";
        alphabet[20] = "T";
        alphabet[21] = "U";
        alphabet[22] = "V";
        alphabet[23] = "W";
        alphabet[24] = "X";
        alphabet[25] = "Y";
        alphabet[26] = "Z";

        System.out.print("Enter an alphabet: ");
        String first = userInput.next();
        System.out.print("Enter another alphabet: ");
        String second = userInput.next();
        System.out.println();

        for (int i = 0; i < 27; i++){
            if (first.toUpperCase().equals(alphabet[i]))
                first_int = i;
            if (second.toUpperCase().equals(alphabet[i]))
                second_int = i;
        }

        int[] count = new int[12];

        count[0] = first_int;
        count[1] = second_int;

        for (int x = 2; x < 12; x++){
            count[x] = count[x - 2] + count[x - 1];

            if (count[x] > 26)
                count[x] -= 26;

            System.out.print(alphabet[count[x - 2]]);
        }
    }
}