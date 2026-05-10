public class Sqrt {
    public static void main(String[] args)
    {
        int n=8;

        int start =1;
        int end =8;
        int ans =0;
        while(start<=end)
        {
            int mid = (start+end)/2;

            long sq = (long) mid*mid;

            if(sq==n)
            {
                ans = mid;
                break;
            }

            else if(sq<n)
            {
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
                System.out.print("Answer="+ans);

    }
}
