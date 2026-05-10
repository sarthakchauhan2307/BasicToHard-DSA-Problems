public class NextGreaterElement {
    public static void main(String[] args)
    {
        int[] arr = {6, 8, 0, 1, 3};

        int[] result = new int[arr.length];

        for(int i =0;i<arr.length;i++)
        {
            result[i] = -1;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] > arr[i])
                {
                    result[i] = arr[j];
                    break;

                }
            }
        }

        System.out.print("Anseer");

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i]);

            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
