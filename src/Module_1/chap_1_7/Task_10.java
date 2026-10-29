package Module_1.chap_1_7;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flg = true;
        while (flg) {
            n++;
            int cnt = 2;
            int ans = 0;
            while (cnt * cnt <= n) {
                if (n % cnt == 0) {
                    ans++;
                    break;
                }
                cnt++;
            }
            if (ans == 0) {
                flg = false;
            }
        }
        System.out.println(n);
    }
}
