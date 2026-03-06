import java.util.Scanner;

public class DecimalToBCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        String bcd = "";

        while(n>0)
        {
            int digit = n%10;
            String binary = "";
            int temp = digit;

            while(temp>0)
            {
                binary = (temp%2) + binary;
                temp /=2;
            }

            while(binary.length()<4)
            {
                binary += "0";
            }

            bcd = binary + " " + bcd;
            n/=10;
        }
        System.out.println("BCD="+bcd);
    }
}
