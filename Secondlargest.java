public class Secondlargest {
    public static void main(String[] args)
    {
         int[] arr = {5, 3, 8, 1, 2};

        int largest = arr[0];
        int secondlargest = arr[0];

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest)
            {
                secondlargest = arr[i];
            }
        }
        System.out.print("second largest="+secondlargest);
    }
}
