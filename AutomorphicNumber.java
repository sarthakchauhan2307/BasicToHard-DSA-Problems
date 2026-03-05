import java.util.*;
public class AutomorphicNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        String s =Integer.toString(n);
        int len = s.length();
        int sq = n*n;
        int digit = sq % (int) Math.pow(10,len);
            if(digit == n)
            {
                System.out.println("automorphic no");
            }
            else{
                System.out.println("not");
            }

        


    }
}
