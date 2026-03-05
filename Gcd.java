import java.util.*;

class Gcd{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no 1: ");
        int n1= sc.nextInt();
        System.out.print("Enter no 2: ");
        int n2= sc.nextInt();

        int min = n1<n2?n1:n2;
        int ans=0;
        for(int i =1;i<min;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                ans = i;
            }
        }
        System.out.print("ans="+ans);


    }
}