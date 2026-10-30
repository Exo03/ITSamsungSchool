package Module_1.chap_1_8;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double ans = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (Math.abs(x) % 2 == 1) {
                cnt++;
                ans += x;
            }
        }
        if (cnt == 0) {
            System.out.println("NO");
        } else {
            System.out.printf("%.2f", ans / cnt);
        }
    }
}
