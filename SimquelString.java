import java.util.Arrays;
import java.util.Scanner;
public class SimquelString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase();

        if(s1.length()!=s2.length())
        {
            System.out.println("not simquel string");
        }
        else{
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            
            Arrays.sort(a1);
            Arrays.sort(a2);

            if(Arrays.equals(a1,a2))
            {
                System.out.println("Simquel string");
            }
            else{
                System.out.println("Strings are Not Simqual");
            }
        }
    }
}
