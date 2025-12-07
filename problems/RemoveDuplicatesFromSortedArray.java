import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k] = nums[i + 1];
                k++;
            }
        }
        return k;
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
