import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        return total - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.close();
        System.out.print(missingNumber(nums));
    }
}
