import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean res = canJump(nums, n);
        System.out.println(res);
    }

    public static boolean canJump(int[] nums, int n) {
        int maxReach = 0;
        for (int i = 0; i < n; i++) {
            if (i > maxReach)
                return false;
            maxReach = Math.max(maxReach, i + nums[i]);
            // if(maxReach >= n - 1) return true;
        }
        return true;
    }

    /*
     * mxR = 0
     * for i = 0 ==> n-1
     * if (i > mxR) false
     * mxR = max(mxR, i + nums[i])
     * true
     */
}
