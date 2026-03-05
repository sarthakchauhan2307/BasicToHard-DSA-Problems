import java.util.*;
public class DecimalToOctale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a decimal no");
        int n = sc.nextInt();
        String octale = "";

        while(n>0)
        {
            int rem = n%8;
            octale =rem+octale;
            n/=8;
        }
        System.out.println("octale no =" +octale);
    }    
}   
