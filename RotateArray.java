import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (nums == null || n == 0 || k % n == 0)
            return;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        rotate(nums, k);
        for (int x : nums)
            System.out.print(x + " ");
    }
}
