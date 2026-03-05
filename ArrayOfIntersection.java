import java.util.*;
public class ArrayOfIntersection {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of 1 arr");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("enter length of 2 arr");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        for(int i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }

       int[] ans = new int[Math.min(n, m)];
        int idx=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    ans[idx++] = arr1[i];
                }
            }
        }

        System.out.println("intersection array : ");
          for(int i=0;i<idx;i++)
        {
           System.out.print(" "+ans[i]);
        }

    }
}
