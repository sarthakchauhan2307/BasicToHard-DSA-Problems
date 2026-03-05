import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int flag =0;
        for(int i =1;i<=n;i++)
        {
            if(i*(i+1) == n)
            {
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("pronic number");

        }
        else{
             System.out.println("not");
        }
    }
}
