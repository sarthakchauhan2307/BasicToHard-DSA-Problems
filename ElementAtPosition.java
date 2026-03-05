import java.util.*;
public class ElementAtPosition {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++)
        {              
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a no to add");
        int no = sc.nextInt();
        System.out.println("enter a index");
        int idx = sc.nextInt();

        for(int i = n;i>idx;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[idx] = no;

        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }




    }
}
