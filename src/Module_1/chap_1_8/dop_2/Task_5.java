package Module_1.chap_1_8.dop_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
