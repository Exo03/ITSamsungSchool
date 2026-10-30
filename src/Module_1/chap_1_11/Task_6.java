package Module_1.chap_1_11;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[2 * n + 1][2 * n + 1];
        int x = n, y = n;
        a[x][y] = 0;
        int cnt = 1;
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < i; j++) {
                    a[x - j - 1][y] = cnt;
                    cnt++;
                }
                x -= i;
                for (int j = 0; j < i; j++) {
                    a[x][y - j - 1] = cnt;
                    cnt++;
                }
                y -= i;
            } else {
                for (int j = 0; j < i; j++) {
                    a[x + j + 1][y] = cnt;
                    cnt++;
                }
                x += i;
                for (int j = 0; j < i; j++) {
                    a[x][y + j + 1] = cnt;
                    cnt++;
                }
                y += i;
            }
        }
        for (int j = 0; j < 2 * n; j++) {
            a[x - j - 1][y] = cnt;
            cnt++;
        }
        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.print(" ");
            for (int j = 0; j < 2 * n + 1; j++) {
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
