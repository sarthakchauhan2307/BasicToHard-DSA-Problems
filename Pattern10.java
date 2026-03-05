public class Pattern10 {
    public static void main(String[] args)
    {
        int n=5;
        int no=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                for(int j=1;j<=5;j++)
                {
                    System.out.print(no+" ");
                    no++;
                }
            }
            else{
                int last = no + n-1;
                for(int j=0;j<n;j++)
                {
                    System.out.print(last-j + " ");
                }
                no+=n;
            }

            System.out.println();
        }
    }
}
