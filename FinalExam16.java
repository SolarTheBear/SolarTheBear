import java.util.*;
public class FinalExam16 {
    //Leap Year
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input a year and I will determine if it is a leap years: ");
        int year = userInput.nextInt();

        boolean isLeapYear = true;
        if (year % 4 == 0) {
            if (year % 100 == 0)
                isLeapYear = year % 400 == 0;
        } else isLeapYear = false;
        if (isLeapYear)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}