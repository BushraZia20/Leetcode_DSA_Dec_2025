import java.util.Scanner;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] word = s.split("\\s+");
        int left = 0, right = word.length - 1;
        while (left < right) {
            String temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", word);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.print(reverseWords(s));
    }
}
