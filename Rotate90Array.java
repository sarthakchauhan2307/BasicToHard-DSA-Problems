import java.util.Scanner;

public class Rotate90Array {
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] rotated = new int[m][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                rotated[j][n-1-i] = matrix[i][j];
            }
        }

         System.out.println("Rotated Matrix:");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(rotated[i][j] + " ");
            }

            System.out.println();
        }
    }
}
