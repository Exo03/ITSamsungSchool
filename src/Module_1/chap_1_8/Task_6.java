package Module_1.chap_1_8;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[][] ans = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            int cnt = -1;
            for (int j = 0; j < n; j++) {
                if (a[i] == ans[j][0]) {
                    cnt = j;
                    break;
                }
            }
            if (cnt != -1) {
                ans[cnt][1] += 1;
            } else {
                ans[i][0] = a[i];
            }
        }
        int mx = -1000000000, mxa = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (ans[i][1] >= mx) {
                mx = ans[i][1];
                mxa = ans[i][0];
            }
        }
        System.out.println(mxa);

    }
}
