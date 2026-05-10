
public class FormLargestNumber {
    public static void main(String[] args)
    {
        int[] nums = {3, 30, 34, 5, 9};

        String[] arr = new String[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            arr[i] = nums[i]+"";
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                String first = arr[i] + arr[j];
                String second = arr[j] + arr[i];

                if(second.compareTo(first) >0)
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String res = "";

        for(int i=0;i<arr.length;i++)
        {
            res += arr[i];
        }
        System.out.println("largest no ="+res);

    }
}
