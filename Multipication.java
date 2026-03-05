import java.util.*;
class Multipication
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no: ");
            int a = sc.nextInt();
             System.out.print("Enter no: ");
            int b = sc.nextInt();
            int mul=1;
            for(int i=1;i<=b;i++)
            {
                mul +=a;
            }
            System.out.print(mul-1);
    }
}