import java.util.Scanner;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sPoint = 0, tPoint = 0;
        int sLength = s.length(), tLength = t.length();
        while (sPoint < sLength && tPoint < tLength) {
            if (s.charAt(sPoint) == t.charAt(tPoint))
                sPoint++;
            tPoint++;
        }
        return sPoint == sLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        System.out.print(isSubsequence(s, t));
    }

}
