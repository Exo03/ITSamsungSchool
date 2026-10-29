package Module_1.chap_1_7.dop;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flg = true;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x <= 437 && flg) {
                flg = false;
                ans = i + 1;
            }
        }
        if (flg) {
            System.out.println("No crash");
        } else {
            System.out.println("Crash " + ans);
        }
    }
}
