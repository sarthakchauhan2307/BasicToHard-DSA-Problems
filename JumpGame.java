public class JumpGame {
    public static void main(String[] args)
    {
        int[] nums = {2, 3, 1, 1, 4};
        int max =0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>max)
            {
                System.out.print("False");
            }

            if(i+nums[i]>max)
            {
                max = i +nums[i];
            }
        }
        System.out.print("True "+max);
        
    }
}
