package Module_1.chap_1_8.dop_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] a = new boolean[n + 1];
        for (int i = 0; i < n - 1; i++) {
            int x = scanner.nextInt();
            a[x] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!a[i]) {
                System.out.println(i);
            }
        }
    }
}
