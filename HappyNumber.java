import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum;
        int temp=n;
        while(true)
        {   sum=0;
            while(temp>0)
            {
                int digit = temp %10;
                int sq = digit * digit;
                sum += sq;
                temp/=10;
            }

            if(sum==1)
            {
                System.out.println("happy number");
                break;
            }
            else if(sum==4)
            {
                System.out.println("not");
                break;
            }
            temp = sum;
        }
        
       
    }
}
