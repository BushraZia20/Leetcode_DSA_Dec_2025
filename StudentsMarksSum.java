import java.util.Scanner;

public class StudentsMarksSum {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number_of_students
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        String gender = sc.next();
        int result = studentsMarksSum(marks, n, gender);
        System.out.print(result);
    }

    public static int studentsMarksSum(int[] arr, int n, String str) {
        int sum = 0;
        if (str.equals("b")) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum += arr[i];
                }
            }
        } else if (str.equals("g")) {
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    sum += arr[i];
                }
            }
        }
        return sum;
    }
}
