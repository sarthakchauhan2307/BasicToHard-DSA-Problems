import java.util.Scanner;

public class SumOfKPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter sum which you want : ");
        int k = sc.nextInt();

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    count++;
                }
            }
        }
        System.out.println("The number of pairs found ="+count);
    }
}

//*Problem statement
// Given an array of N integers, and an integer K, find the number of pairs of elements in the
// array whose sum is equal to K.
// e.g. Input: N = 4, K = 6
// arr[] = {1, 5, 7, 1}
// Output: 2
// ExplanaƟon:
// arr[0] + arr[1] = 1 + 5 = 6
// and arr[1] + arr[3] = 5 + 1 = 6.
