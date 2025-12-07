import java.util.Scanner;

public class RemoveDupsFromSortedArrII {
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 3)
            return nums.length;
        int ind = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[ind - 2]) {
                nums[ind++] = nums[i];
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.close();
        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++)
            System.out.print(nums[i] + " ");
    }
}
