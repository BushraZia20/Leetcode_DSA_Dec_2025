import java.util.Scanner;

public class JumpGameII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res = jump(nums);
        System.out.println(res);
    }

    public static int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int l = 0;
        int r = 0;
        int farthest = 0;
        while (r < n - 1) {
            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            l = r + 1;
            r = farthest;
            jumps += 1;
        }
        return jumps;
    }
}

/**
 * jumps = 0
 * l = 0
 * r = 0
 * farthest = 0
 * while(r < n-1)
 * for(l -> r){
 * farthest = max(farthest, i+nums[i])
 * }
 * l = r+1
 * r = farthest
 * jump += 1
 */

/**
 * TC = O(N) (bcz while loop doesnt loop through the array it just checls if r
 * has reached to the last ind or passed it)
 * SC = O(1)
 */