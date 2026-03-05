import java.util.*;
public class PowerWithoutMultipication {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter y");
        int y = sc.nextInt();

         System.out.println("enter x");
        int x = sc.nextInt();

        int pow=1;
        for(int i=1;i<=y;i++)
        {
            int temp=0;
            for(int j=1;j<=x;j++)
            {
                temp+=pow;
            }
            pow = temp;
        }
        System.out.println("Ans"+pow);
    }
}
