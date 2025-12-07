import java.util.*;

class RmsArray {
    public static double findRMS(int[] arr, int n) {
        int[] temp = new int[n];
        int sqSum = 0;
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i] * arr[i];
            sqSum += temp[i];
        }

        double meanSq = (double) sqSum / n;

        double rootMeanSq = Math.sqrt(meanSq);
        return rootMeanSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double res = findRMS(arr, n);
        System.out.printf("%.6f", res);
        sc.close();
    }
}