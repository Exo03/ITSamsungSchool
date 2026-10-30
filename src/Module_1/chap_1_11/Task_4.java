package Module_1.chap_1_11;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n * m; i++) {
            a[i / m][i % m] = (i / m) * (i % m);
        }
    }
}
