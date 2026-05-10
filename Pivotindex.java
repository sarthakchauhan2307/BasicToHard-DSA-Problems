public class Pivotindex {
    public static void main (String[] args)
    {
         int[] arr = {1, 7, 3, 6, 5, 6};

        int total = 0;

        for(int i=0;i<arr.length;i++)
        {
            total += arr[i];
        }
        int leftsum=0;

        for(int i=0;i<arr.length;i++)
        {
            int rightsum = total -leftsum-arr[i];

            if(leftsum==rightsum)
            {
                System.out.print("pivot index ="+i);
            }

            leftsum +=arr[i];
        }
    }
}
