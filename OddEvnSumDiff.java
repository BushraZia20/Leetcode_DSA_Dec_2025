import java.util.Scanner;

public class OddEvnSumDiff {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = oddEvenSumDiff(arr, n);
        System.out.println(res);
    }

    public static int oddEvenSumDiff(int[] arr, int n) {
        int evnSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evnSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        return Math.abs(oddSum - evnSum);
    }
}
