public class FinalExam9 {
    //100th Prime Numbers
    static boolean checkForPrime(int inputNumber) {
        for (int i = 2; i <= inputNumber/2; i++)
            if (inputNumber % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        int x = 0;
        for (int i = 2; true; i++) {
            if (checkForPrime(i))
                x++;
            if (x == 100) {
                System.out.println("\nThe 100th prime number is " + i + ".");
                break;
            }
        }
    }
}
