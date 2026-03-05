import java.util.*;
class SumOfDigit
{
      public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no: ");
            int n = sc.nextInt();
            int sum =0;
            while(n!=0)
            {
                int digit = n%10;
                n/=10;
                sum+=digit;
            }
            System.out.print(sum);
        }
}