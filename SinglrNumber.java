import java.util.Scanner;

public class SinglrNumber {
    public static int singleNumber(int[] nums) {
        int singleOne = 0;
        for (int num : nums)
            singleOne ^= num;
        return singleOne;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.close();
        System.out.print(singleNumber(nums));
    }
}
