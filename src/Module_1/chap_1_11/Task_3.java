package Module_1.chap_1_11;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        boolean flg = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (a[i][j] != a[j][i]) {
                        flg = false;
                        break;
                    }
                }
            }
        }
        if (flg) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
