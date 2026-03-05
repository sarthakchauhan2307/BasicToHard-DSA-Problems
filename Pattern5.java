
public class Pattern5 {
    public static void main(String[] args)
    {
        int no;
        for(int i=1;i<=5;i++)
        {
             no=1;
            for(int j=1;j<=2*i-1;j++)
            {
                if(j<i)
                {
                    if(j%2==0)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(no);
                    }
                    no++;
                }
                else{
                    
                    no--;
                }
                
            }
            System.out.println();
        }
    }    
}
