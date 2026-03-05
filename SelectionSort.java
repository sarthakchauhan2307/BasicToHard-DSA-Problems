import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            if (minidx != i) {
                int temp = arr[i];
                arr[i] = arr[minidx];
                arr[minidx] = temp;
            }
        }
    }
}
