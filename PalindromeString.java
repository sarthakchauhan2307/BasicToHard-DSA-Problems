import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();

        String copy = "";

        for(int i=str.length()-1;i>=0;i--){
            copy += str.charAt(i);
        }
        System.out.println(copy);
        if(str.equals(copy))
        {
            System.out.println("palindrome strinf");
        }
        else{
            System.out.println("not");
        }
    }
}
