import java.util.*;
public class CoinChange {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input amount
        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        // Input number of denominations
        System.out.print("Enter number of denominations: ");
        int n = sc.nextInt();

        int[] coins = new int[n];

          System.out.println("Enter denominations:");

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        Arrays.sort(coins);

        int count=0;

        for(int i =n-1;i>=0;i--)
        {
            while(amount>=coins[i])
            {
                amount -= coins[i];
                System.out.print(coins[i] + " ");

                count++;
            }
        }

          System.out.println("Minimum coins needed: " + count);

    }
}
