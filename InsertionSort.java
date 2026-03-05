import java.util.*;
public class InsertionSort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of 1 arr");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        insertionsort(arr);

         System.out.println("Sorted array : ");
          for(int i=0;i<n;i++)
        {
           System.out.print(" "+arr[i]);
        }
    }

    public static void  insertionsort(int[] arr)
    {
        int i=0;
        int key;
        while(i<arr.length)
        {
            key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = key;
            i++;
        }

        
    }
}
