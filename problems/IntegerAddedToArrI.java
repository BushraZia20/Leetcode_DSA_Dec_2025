import java.util.Arrays;
import java.util.Scanner;

public class IntegerAddedToArrI {
    public static int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x = 0;
        for (int i = 0; i < nums1.length; i++) {
            x = nums2[i] - nums1[i];
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++)
            nums1[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            nums2[i] = sc.nextInt();
        sc.close();
        System.out.print(addedInteger(nums1, nums2));
    }
}
