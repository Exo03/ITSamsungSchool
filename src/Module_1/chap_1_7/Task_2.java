package Module_1.chap_1_7;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, ans = 0;
        do {
            x = scanner.nextInt();
            if (x > 10) ans += x;
        } while (x % 5 != 0);
        System.out.println(ans);
    }
}
