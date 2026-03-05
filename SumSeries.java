import java.util.*;
class SumSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            sum+=(i*i);
        }
        System.out.println("sum="+sum);
    }
}