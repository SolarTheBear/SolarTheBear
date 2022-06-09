import java.util.*;
public class FinalExam3 {
    //Clock Watcher
    static String doubleDigits(int num1, int num2) {
        if (num1 < 10 && num2 < 10)
            return "0" + num1 + ":0" + num2;
        if (num2 < 10)
            return num1 + ":0" + num2;
        if (num1 < 10)
            return "0" + num1 + ":" + num2;
        else
            return num1 + ":" + num2;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter how many minutes per hour faster you want the first clock to be (0 to 127): ");
        int first = userInput.nextInt();
        System.out.println("Enter how many minutes per hour faster you want the second clock to be (0 to 127): ");
        int second = userInput.nextInt();

        if (first >= 0 && first < 128 && second >= 0 && second < 128) {
            int hour1 = 0;
            int minute1 = 0;
            int hour2 = 0;
            int minute2 = 0;

            for (int x = 1; true; x++) {
                minute1 += first;
                minute2 += second;

                for (;true;) {
                    if (minute1 >= 60) {
                        hour1 += 1;
                        minute1 -= 60;
                    }
                    else if (hour1 >= 24)
                        hour1 -= 24;
                    else break;
                }
                for (;true;) {
                    if (minute2 >= 60) {
                        hour2 += 1;
                        minute2 -= 60;
                    }
                    else if (hour2 >= 24)
                        hour2 -= 24;
                    else break;
                }
                if (hour1 == hour2 && minute1 == minute2) {
                    System.out.println("\nAfter "+ x +" hour(s), both clocks will show " +doubleDigits(hour1, minute1));
                    break;
                }
            }
        } else System.out.println("\nYour inputs weren't between 0 and 127\n\nTry Again");
    }
}