import java.util.Scanner;

public class ConcatenationOfArr {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++)
            res[i] = nums[i];
        for (int i = 0; i < n; i++)
            res[n + i] = nums[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.close();
        int[] res = getConcatenation(nums);
        for (int x : res)
            System.out.print(x + " ");
    }
}
