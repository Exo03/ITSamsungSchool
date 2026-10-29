package Module_1.chap_1_7;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int ans = 10;
        while (a / 10 > 0) {
            if ((a % 10) % 2 == 1) {
                ans = a % 10;
                break;
            }
            a /= 10;
        }
        if (ans == 10 && (a % 10) % 2 == 1) {
            ans = a % 10;
        }
        if (ans == 10) {
            System.out.println("NO");
        } else {
            System.out.println(ans);
        }
    }
}
