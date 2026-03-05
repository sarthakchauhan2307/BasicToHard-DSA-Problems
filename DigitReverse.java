import java.util.*;
class DigitReverse{
      public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no: ");
            int n = sc.nextInt();
            
            while(n!=0)
            {
                int digit = n%10;
                n/=10;
                System.out.print(digit);
            }
        }
        
}