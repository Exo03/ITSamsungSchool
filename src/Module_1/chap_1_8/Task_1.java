package Module_1.chap_1_8;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int x = scanner.nextInt(), ans = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                ans = i + 1;
                break;
            }
        }
        if (ans != -1) {
            System.out.println(ans);
        } else {
            System.out.println("NO");
        }
    }
}
