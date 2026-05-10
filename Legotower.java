public class Legotower {
    public static void main(String[] args)
    {
        int[] red = {3, 5, 2};
        int[] blue = {4, 1, 6};

        int redstart =0;
        int bluestart =0;

        for(int i=0;i<red.length;i++)
        {
            if(i%2==0)
            {
                redstart += red[i];
            }
            else{
                redstart += blue[i];
            }
        }

        
        for(int i=0;i<blue.length;i++)
        {
            if(i%2==0)
            {
                bluestart += blue[i];
            }
            else{
                bluestart += red[i];
            }
        }

        int max;

        if(redstart>bluestart)
        {
            max = redstart;

        }
        else{
            max = bluestart;
        }

         System.out.println("Maximum Height = " + max);
    }
}
