package Module_1.chap_1_7;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0, cnt = 26;
        while (cnt <= n && cnt < 100) {
            ans += cnt;
            cnt += 2;
        }
        System.out.println(ans);
    }
}
