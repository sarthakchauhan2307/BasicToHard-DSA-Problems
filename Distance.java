import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1");
        int n1 = sc.nextInt();
         System.out.println("Enter a num2");
        int n2 = sc.nextInt();

        int xor = n1^n2;
        int count = 0;

        while(xor>0)
        {
            count += xor%2;
            xor/=2;
        }

        System.out.println("distance = "+count);
    }
    
}