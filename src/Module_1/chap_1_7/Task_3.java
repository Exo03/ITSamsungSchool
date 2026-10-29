package Module_1.chap_1_7;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, ans = 0;
        do {
            x = scanner.nextInt();
            if (x > 9 && x < 100) ans += x / 10 + x % 10;
        } while (x > 9 && x < 100);
        System.out.println(ans);
    }
}
