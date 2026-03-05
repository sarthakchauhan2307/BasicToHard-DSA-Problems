import java.util.*;
public class OctaleToDecimal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a octale no");
        int n = sc.nextInt();
        int decimal = 0;
        int base =1;
        while(n>0)
        {
            int rem = n %10;
            decimal += rem *base;
            base *=8;
            n/=10;
        }
        System.out.println("decimal no:"+decimal);
    }
}
