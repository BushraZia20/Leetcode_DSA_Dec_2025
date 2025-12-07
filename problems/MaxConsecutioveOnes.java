import java.util.Scanner;

public class MaxConsecutioveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count++;
            else
                count = 0;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.close();
        System.out.print(findMaxConsecutiveOnes(nums));
    }

}
