package Module_1.chap_1_7.dop;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 0;
        while (x != 0) {
            ans += x % 10;
            x /= 10;
        }
        System.out.println(ans);
    }
}
