import java.util.*;

class Power{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no: ");
            int x= sc.nextInt();
             System.out.print("Enter no: ");
            int y= sc.nextInt();
            int mul=1;
            for(int i=1;i<=y;i++)
            {
                mul *= x;
            }
            System.out.print(mul);
    }
}