package Module_1.chap_1_9;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(avgOf4Digit(a));
    }

    public static double avgOf4Digit(int[] a) {
        double ans = 0;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 999 && a[i] < 10000) {
                ans += a[i];
                cnt++;
            }
        }
        if (cnt != 0) {
            return ans / cnt;
        } else {
            return -1;
        }
    }
}
