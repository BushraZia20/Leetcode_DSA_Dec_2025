import java.util.Scanner;

public class TwoSumII_SortedArr {
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = new int[2];
        int l = 0, r = n - 1;
        for (int i = 0; i < n; i++) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                res[0] = l + 1;
                res[1] = r + 1;
                break;
            }
            if (sum > target)
                r--;
            else
                l++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();
        sc.close();
        int[] ans = twoSum(numbers, target);
        System.out.print(ans[0] + " " + ans[1]);
    }

}
