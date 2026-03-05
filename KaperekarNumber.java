import java.util.*;
public class KaperekarNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int sq = n*n;
        int digit = s.length();

        int divider = (int)Math.pow(10,digit);

        int right = sq % divider;
        int left = sq / divider;

        int total = left+ right;

        if(total==n)
        {
            System.out.println("karpekar number");

        }
        else{
            System.out.println("not");
        }
        

    }
}
