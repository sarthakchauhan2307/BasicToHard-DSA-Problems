public class Pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++)
        {
            System.out.print(1);
            for(int j=2;j<i;j++)
            {
                 System.out.print("*");
            }
            System.out.print(i);

            for(int j=2;j<i;j++)
            {
                System.out.print("*");
            }
            
            System.out.print(1);

            System.out.println();
        }
    }
}
