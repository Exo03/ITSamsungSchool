package Module_1.chap_1_8.dop_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        a--;
        b--;
        c--;
        d--;
        int[] m = new int[n];
        int[] tmp = new int[n];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = i + 1;
        }
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            tmp[cnt] = m[i];
            cnt++;
        }
        for (int i = b; i >= a; i--) {
            tmp[cnt] = m[i];
            cnt++;
        }
        for (int i = b + 1; i < n; i++) {
            tmp[cnt] = m[i];
            cnt++;
        }
        cnt = 0;
        for (int i = 0; i < c; i++) {
            ans[cnt] = tmp[i];
            cnt++;
        }
        for (int i = d; i >= c; i--) {
            ans[cnt] = tmp[i];
            cnt++;
        }
        for (int i = d + 1; i < n; i++) {
            ans[cnt] = tmp[i];
            cnt++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
