//1+(1+2)+(1+2+3)....(1+2+3..+n)

import java.util.*;
public class SumPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int total=0;
        for(int i=1;i<=n;i++)
        {   int sum =0;
            for(int j=1;j<=i;j++)
            {
                sum+=j;
            }
            total+=sum;
        }
        
        System.out.print("sum="+total);
    }
}
