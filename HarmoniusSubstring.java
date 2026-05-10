import java.util.ArrayList;

public class HarmoniusSubstring {
    public static void main(String[] args)
    {
        String str = "ABA";
        ArrayList<String> res = new ArrayList<>();

        for(int i =0;i<str.length();i++)
        {
                for(int j = i;j<str.length();j++)
                {
                    String sub = str.substring(i,j+1);
                    int[] freq = new int[26];

                    for(int k = 0;k<sub.length();k++)
                    {
                        char ch = sub.charAt(k);
                        freq[ch - 'A']++;
                    }

                    int max =0;
                    int min = Integer.MAX_VALUE;

                // find max and min
                  for (int k = 0; k < 26; k++) {

                    if (freq[k] > 0) {

                        if (freq[k] > max) {
                            max = freq[k];
                        }

                        if (freq[k] < min) {
                            min = freq[k];
                        }
                    }
                }
                 if (max - min <= 1) {
                    res.add(sub);
                }
            }
        }
        System.out.println(res);
    }
}
