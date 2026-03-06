import java.util.Scanner;

public class OctaleToHexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary");
        int n = sc.nextInt();
        int decimal=0;
        int base =1;

        while(n>0)
        {
            int digit = n %10;
            decimal += digit * base;
            base *= 8;
            n/=10;
        }

        String hexa = "";
        while(decimal>0)
        {
            int digit = decimal % 16;

            if(digit <10)
            {
                hexa = digit + hexa;
            }
            else 
            {
                hexa = (char) (digit - 10 + 'A') + hexa;
            }
            decimal /=16;
        }
        System.out.println("hexa decimal="+hexa);
    }
}
