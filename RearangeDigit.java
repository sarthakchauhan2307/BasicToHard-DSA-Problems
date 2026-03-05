//* solution for this first sort digit kriya 
// and pachi array ma nakhiya jo first element 0 hoi to second sathe swap kri nakhiyo
//  */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RearangeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a num");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int i=0;
        while(n>0)
        {
            int digit = n % 10;
            list.add(digit);
            n/=10;
            i++;
        }
        Integer[] digits = list.toArray(new Integer[0]);
        Arrays.sort(digits);
        if(digits[0]==0)
        {
            for(int j=0;j<digits.length;j++)
            {
                if(digits[j]!=0)
                {
                    int temp = digits[0];
                    digits[0] = digits[j];
                    digits[j] = temp;
                    break;
                }
            }
        }
        System.out.println("answer:");
        for(int j =0;j<digits.length;j++)
        {
            System.out.print(digits[j]);
        }

    }
}
