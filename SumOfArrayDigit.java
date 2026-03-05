import java.util.Scanner;

public class SumOfArrayDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxsum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(sumofdigit(arr[i])==sumofdigit(arr[j]))
                {
                    int pairsum = arr[i]+arr[j];

                    if(pairsum>maxsum)
                    {
                        maxsum = pairsum;
                    }
                }
            }
        }
        System.out.println("Maximum sum="+maxsum);
       
    }

    public static int sumofdigit(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
}
