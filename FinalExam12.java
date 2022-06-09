public class FinalExam12 {
    //70th Harshad Number
    public static boolean checkForHarshad(int number) {
        int x = number;
        int sumOfDigits = 0;
        while (x > 0) {
            int y = x % 10;
            sumOfDigits += y;
            x /= 10;
        }
        return number % sumOfDigits == 0;
    }
    public static void main(String[] args) {
        int x = 0;
        for (int i = 2; true; i++) {
            if (checkForHarshad(i)) {
                x++;
                if (x == 70) {
                    System.out.println("\nThe 70th Harshad number is " + i + ".");
                    break;
                }
            }
        }
    }
}