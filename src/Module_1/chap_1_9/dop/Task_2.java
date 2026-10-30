package Module_1.chap_1_9.dop;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(min(a, b, c, d));
    }

    public static int min(int a, int b, int c, int d) {
        int[] m = {Math.abs(a), Math.abs(b), Math.abs(c), Math.abs(d)};
        int ans = Math.abs(a);
        for (int i = 0; i < 4; i++) {
            if (m[i] < ans) {
                ans = m[i];
            }
        }
        return ans;
    }
}
