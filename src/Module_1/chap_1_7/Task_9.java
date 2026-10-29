package Module_1.chap_1_7;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int ans = 10;
        while (a / 10 > 0) {
            if (a % 10 < ans && a % 10 != 0) {
                ans = a % 10;
            }
            a /= 10;
        }
        if (a % 10 < ans && a % 10 != 0) {
            ans = a % 10;
        }
        System.out.println(ans);
    }
}
