public class ReArrangeArray {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int n = arr.length;
        int mid = n/2;
        int[] res = new int[n];

        int idx=0;
        for(int i =0;i<mid;i++)
        {
            res[idx] = arr[i];
            idx++;
            res[idx] = arr[mid+i];
            idx++;
        }

          System.out.print("Output: [");

        for (int i = 0; i < res.length; i++) {

            System.out.print(res[i]);

            if (i < res.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }
}
