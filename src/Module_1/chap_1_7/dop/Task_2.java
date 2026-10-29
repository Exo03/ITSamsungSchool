package Module_1.chap_1_7.dop;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = 0;
        if (b < 0) {
            b = -b;
            for (int i = 0; i < b; i++) {
                ans -= a;
            }
        } else if (b > 0) {
            for (int i = 0; i < b; i++) {
                ans += a;
            }
        }
        System.out.println(ans);
    }
}
