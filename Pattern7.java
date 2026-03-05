public class Pattern7 {
    public static void main(String[] args) {
       
        for(int i=1;i<=4;i++)
        {
            //  for(int m=4;m<=4-i;m--)
            // {
            // System.out.print("  ");
            // }
            for(int k=i;k>=1;k--)
             {
                System.out.print(" "+k);
             }
            
            for(int j=2;j<=i;j++)
              {
                System.out.print(" "+j);
              }
             
            System.out.println();
        }
         for(int i=3;i>=1;i--)
        {
            for(int k=i;k>=1;k--)
             {
                System.out.print(" "+k);
             }
            
            for(int j=2;j<=i;j++)
              {
                System.out.print(" "+j);
              }
             
            System.out.println();
        }
    }
}
