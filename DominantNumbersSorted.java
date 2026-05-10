import java.util.*;

public class DominantNumbersSorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 4, 5, 1, 1, 1};

        Arrays.sort(arr);  // Step 1: sort array

        int n = arr.length;

        // Step 2: count unique elements
        int uniqueCount = 1; // at least one element
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Step 3: count frequency and find dominant numbers
        List<Integer> result = new ArrayList<>();

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                // check previous element
                if (count > uniqueCount) {  // change to >= if needed
                    result.add(arr[i - 1]);
                }
                count = 1;
            }
        }

        // check last element
        if (count > uniqueCount) {
            result.add(arr[n - 1]);
        }

        System.out.println(result);
    }
}