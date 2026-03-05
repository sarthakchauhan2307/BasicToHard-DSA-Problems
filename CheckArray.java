import java.util.Scanner;

public class CheckArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<arr.length;i++)
        {
           if(arr[i] < arr[i-1])
           {
              System.out.println(0);

           }
        }
        int count=1;
        int group =0;

        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else{
                if(count >=3)
                {
                    group++;
                    count=1;
                }
            }
        }
        if(count>=3){
            group++;
            System.out.println(1);
        }
        System.out.println(0);
    }
}
