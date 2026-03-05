import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();

        for(int i=2;i<=5;i++)
        {
            while(n%i==0)
            {
                n/=i;
            }
        }
        if(n==1)
        {
            System.out.println("ugly no");
        }
        else{
            System.out.println("not ugly");

        }
    }
}
