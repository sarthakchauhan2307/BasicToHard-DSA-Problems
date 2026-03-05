import java.util.Scanner;

public class City3Building {

    public static long numberOfWays(String s) {
        int n = s.length();
        long count = 0;

        for (int i = 0; i < n - 1; i++) {

            int leftzero = 0, leftone = 0;
            int rightzero = 0, rightone = 0;

            // Count left side
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '0') {
                    leftzero++;
                } else {
                    leftone++;
                }
            }

            // Count right side
            for (int k = i + 1; k < n; k++) {
                if (s.charAt(k) == '0') {
                    rightzero++;
                } else {
                    rightone++;
                }
            }

            if (s.charAt(i) == '0') {
                count += (long) leftone * rightone;
            } else {
                count += (long) rightzero * leftzero;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary string:");
        String s = sc.nextLine();

        long result = numberOfWays(s);

        System.out.println("Number of ways: " + result);

        sc.close();
    }
}