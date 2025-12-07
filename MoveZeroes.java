import java.util.Scanner;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        while (j < n) {
            if (nums[i] != 0) {
                i++;
                j++;
            } else if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.close();
        moveZeroes(nums);
        for (int x : nums)
            System.out.print(x + " ");
    }
}
