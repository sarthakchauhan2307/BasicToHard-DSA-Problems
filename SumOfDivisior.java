import java.util.*;
class SumOfDivisior{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no 1: ");
        int n1= sc.nextInt();
        int sum =0;
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                sum+=i;
                
            }
        }
        System.out.println("sum="+sum);
    }
}