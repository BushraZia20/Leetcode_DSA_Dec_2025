import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        String ans = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i))
                ans += str1.charAt(i);
            else
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++)
            strs[i] = sc.next();
        sc.close();
        System.out.print(longestCommonPrefix(strs));
    }
}
