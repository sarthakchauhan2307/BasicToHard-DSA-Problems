import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();
        String  result ="";

        for(int i=s.length()-1;i>=0;i--)
        {
            st.push(s.charAt(i));
        }

        while(!st.isEmpty())
        {
            int count = st.pop() -'0';
            char ch = st.pop();

            for(int i=0;i<count;i++)
            {
                result+=ch;
            }

        }
        System.out.println(result);
    }
}
