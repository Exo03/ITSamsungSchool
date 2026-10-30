package Module_1.chap_1_8.dop_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (i == 0) {
                ans = x;
            } else {
                if (x > ans) {
                    ans = x;
                }
            }
        }
        System.out.println(ans);
    }
}
