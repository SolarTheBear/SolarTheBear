public class FinalExam15 {
    //Lojban Sum
    public static void main(String[] args) {
        String[] Lojban = new String[10];

        Lojban[0] = "no";
        Lojban[1] = "pa";
        Lojban[2] = "re";
        Lojban[3] = "ci";
        Lojban[4] = "vo";
        Lojban[5] = "mu";
        Lojban[6] = "xa";
        Lojban[7] = "ze";
        Lojban[8] = "bi";
        Lojban[9] = "so";

        int one = (int) Math.floor(Math.random() * 1000);
        int two = (int) Math.floor(Math.random() * 1000);

        int sum = one + two;

        String num1 = String.valueOf(one);
        String[] Lojban1 = new String[num1.length()];
        StringBuilder dig1 = new StringBuilder();

        String num2 = String.valueOf(two);
        String[] Lojban2 = new String[num2.length()];
        StringBuilder dig2 = new StringBuilder();

        String num3 = String.valueOf(sum);
        String[] Lojban3 = new String[num3.length()];
        StringBuilder dig3 = new StringBuilder();

        for (int x = 0; x < num1.length(); x++) {
            Lojban1[x] = Lojban[Integer.parseInt(String.valueOf(num1.charAt(x)))];
            dig1.append(Lojban1[x]);
        }

        for (int x = 0; x < num2.length(); x++) {
            Lojban2[x] = Lojban[Integer.parseInt(String.valueOf(num2.charAt(x)))];
            dig2.append(Lojban2[x]);
        }

        for (int x = 0; x < num3.length(); x++) {
            Lojban3[x] = Lojban[Integer.parseInt(String.valueOf(num3.charAt(x)))];
            dig3.append(Lojban3[x]);
        }

        System.out.println("\n" + dig1 + " + " + dig2 + " = " + dig3);
    }
}