public class ReverseStringWithoutSymbol {
    public static void main(String[] args) {
        String s = "a!!!b.c.d,e'f,ghi";
        System.out.println(reverseString(s));

        String s2 = "Ab,c,de!$";
        System.out.println(reverseString(s2));
    }

    public static String reverseString(String s)
    {
        char[] arr = s.toCharArray();

        int j = arr.length -1;

        for(int i =0;i<arr.length;i++)
        {
            if(Character.isLetter(arr[i]))
            {
                while(!Character.isLetter(arr[j]))
                {
                    j--;
                }

                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return new String(arr);
    }
}
