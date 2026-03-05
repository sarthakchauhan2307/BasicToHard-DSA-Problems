import java.util.*;
public class ReverseArray {
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


        System.out.println("rotated array");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
