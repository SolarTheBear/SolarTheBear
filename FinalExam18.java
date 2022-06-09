public class FinalExam18 {
    //Last One!!!
    //Console Roulette
    static int[] red = new int[18]; static int x = 0; static {
        red[0] = 1; red[1] = 3; red[2] = 5; red[3] = 7; red[4] = 9;
        red[5] = 12; red[6] = 14; red[7] = 16; red[8] = 18; red[9] = 19;
        red[10] = 21; red[11] = 23; red[12] = 25; red[13] = 27;
        red[14] = 30; red[15] = 32; red[16] = 34; red[17] = 36;
    }
    static boolean isRed(int spin) {
        for (;x < 17; x++)
            if (spin == red[x])
                break;
        return spin == red[x];
    }
    public static void main(String[] args) {
        int spin = (int) Math.floor(Math.random() * 38 + 1);

        if (spin < 37) {
            System.out.println("The spin resulted in " + spin + "...");
            System.out.println("Pay " + spin);
            if (isRed(spin))
                System.out.println("Pay Red");
            else System.out.println("Pay Black");
            if (spin % 2 == 0)
                System.out.println("Pay Even");
            else System.out.println("Pay Odd");
            if (spin < 19)
                System.out.println("Pay 1 to 18");
            else System.out.println("Pay 19 to 36");
        }
        else if (spin < 38) System.out.println("The spin resulted in 0...\nPay 0");
        else System.out.println("The spin resulted in 00...\nPay 00");
    }
}