import java.util.Scanner;

public class IsValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return false;
        int start = 0, end = s.length() - 1;
        while (start < end) {
            char left = s.charAt(start);
            char right = s.charAt(end);
            if (!Character.isLetterOrDigit(left)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                end--;
                continue;
            }
            if (Character.toLowerCase(left) != Character.toLowerCase(right))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.print(isPalindrome(s));
    }

}
