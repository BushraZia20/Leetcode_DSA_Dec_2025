import java.util.Scanner;

public class IndexOfFirstOccuranceOfStr {
    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        if (index >= 0)
            return index;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        sc.close();
        System.out.print(strStr(haystack, needle));
    }
}
