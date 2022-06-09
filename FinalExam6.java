import java.util.*;
public class FinalExam6 {
    //Time elapsed
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program calculates how much time elapses between two moments.\n");
        System.out.print("Enter a time in HH:MM:SS AM/PM format: ");
        String input1 = userInput.nextLine();
        System.out.print("Enter another time in HH:MM:SS AM/PM format: ");
        String input2 = userInput.nextLine();

        int hour1 = Integer.parseInt(input1.substring(0,2));
        int minute1 = Integer.parseInt(input1.substring(3,5));
        int second1 = Integer.parseInt(input1.substring(6,8));

        int hour2 = Integer.parseInt(input2.substring(0,2));
        int minute2 = Integer.parseInt(input2.substring(3,5));
        int second2 = Integer.parseInt(input2.substring(6,8));

        if (hour1 < 24 && hour2 < 24 && minute1 < 60 && minute2 < 60 && second1 < 60 && second2 < 60) {
            int sum1 = (hour1 * 3600) + (minute1 * 60) + second1;
            int sum2 = (hour2 * 3600) + (minute2 * 60) + second2;

            int time;
            if (sum1 > sum2) {
                int overnight = (24 * 3600) - sum1;
                time = overnight + sum2;
            } else time = sum2 - sum1;

            int hour3 = 0;
            int minute3 = 0;
            int second3 = time;

            for (;time >= 60; time -= 60)
                minute3 += 1; second3 -= 60;
            for (;minute3 >= 60; minute3 -= 60)
                hour3 += 1;

            System.out.println("\n" + hour3 +" hours, "+ minute3 +" minutes, and "+ second3 +" seconds passed between "
                    + input1 + " and " + input2 + ".");
        } else System.out.println("\nThe input number does not fit the given format.\n\nTry Again\n");
    }
}