import java.util.Arrays;

public class OperationArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,9,2,12,15,21,12,25,50,55};

        int max =arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("maximum="+max);
        System.out.println("minimum="+min);

        Arrays.sort(arr);

        System.out.println("second largst element="+arr[arr.length-2]);
        System.out.println("second minim element="+arr[1]);


    }
}
