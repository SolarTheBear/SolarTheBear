public class FinalExam13 {
    //Perfect Numbers
    public static void findPerfectNumber(int number) {
        int sum = 0;
        for (int divisor = 1; divisor < number; divisor++)
            if ((number % divisor) == 0)
                sum += divisor;
        if (sum == number)
            System.out.println(number);
    }
    public static void main(String[] args) {
        System.out.println("The nearest Perfect numbers after 28 is:  ");
        for (int i = 29; i <= 500; i++)
            findPerfectNumber(i);
    }
}