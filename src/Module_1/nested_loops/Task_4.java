package Module_1.nested_loops;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        int cnt = 0;
        int[][] ans = new int[n][3];
        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= n / b; j++) {
                for (int k = 0; k <= n / c; k++) {
                    if (a * i + b * j + c * k == n) {
                        ans[cnt][0] = i;
                        ans[cnt][1] = j;
                        ans[cnt][2] = k;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
