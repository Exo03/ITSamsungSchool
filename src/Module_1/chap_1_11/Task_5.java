package Module_1.chap_1_11;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = cnt;
                    cnt++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    a[i][j] = cnt;
                    cnt++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            for (int j = 0; j < m; j++) {
                if (a[i][j] < 10) {
                    System.out.print(" " + a[i][j] + " ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
