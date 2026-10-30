package Module_1.chap_1_8;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        boolean flg = false;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                ans += x;
                flg = true;
            }
        }
        if (flg) {
            System.out.println(ans);
        } else {
            System.out.println("NO");
        }
    }
}
