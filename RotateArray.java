import java.util.*;

public class RotateArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        k = k % n; 

        kswap(arr, k);

        System.out.println("Rotated Array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void kswap(int[] arr, int k)
    {
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int last = arr[n - 1]; 
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }
    }
}
