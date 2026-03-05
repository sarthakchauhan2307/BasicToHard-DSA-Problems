import java.util.*;

class Factors{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no 1: ");
        int n1= sc.nextInt();

        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                System.out.println(i);
            }
        }
    }
}