import java.util.*;
public class FinalExam17 {
    //License Plates
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter license plate: ");
        String license = userInput.nextLine();
        int abc = 0;
        int num = 0;
        int abc2 = 0;
        int num2 = 0;
        for (int i = 3; i < license.length(); i++) {
            if (Character.isDigit(license.charAt(i)))
                num++;
        }
        for (int j = 0; j < license.length(); j++) {
            if (Character.isUpperCase(license.charAt(j)))
                abc++;
        }
        for (int j = 4; j < license.length(); j++) {
            if (Character.isUpperCase(license.charAt(j)))
                abc2++;
        }
        for (int i = 0; i < license.length(); i++) {
            if (Character.isDigit(license.charAt(i)))
                num2++;
        }
        if (num == 3 && abc == 3)
            System.out.println(license + " is an old license plate!");
        else if (num2 == 4 && abc2 == 3)
            System.out.println(license + " is a new license plate!");
        else
            System.out.println("This license plate is not valid for either style.");
    }
}