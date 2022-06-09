public class FinalExam11 {
    //20th Armstrong Numbers
    static boolean checkForArmstrong(int num) {
        int temp, digits = 0, last, sum = 0;
        temp = num;
        for (;temp > 0; digits++)
            temp /= 10;
        temp = num;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp /= 10;
        }
        return num == sum;
    }
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0;; i++) {
            if (checkForArmstrong(i)) {
                x++;
                if (x == 20) {
                    System.out.println("\nThe 20th Armstrong number is " + i + ".");
                    break;
                }
            }
        }
    }
}