import java.util.Scanner;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int l = 0, r = n - 1, maxAr = 0;
        while (l < r) {
            int currHeight = Math.min(height[l], height[r]);
            int width = r - l;
            int area = currHeight * width;
            maxAr = Math.max(maxAr, area);
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxAr;
    }

    public static void main(String[] args) {
        int[] height;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            height = new int[n];
            for (int i = 0; i < n; i++)
                height[i] = sc.nextInt();
        }
        System.out.print(maxArea(height));
    }
}
