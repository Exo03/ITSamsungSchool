package Module_1.chap_1_6.dop;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = -1000000000;
        if (a > ans) {
            ans = a;
        }
        if (b > ans) {
            ans = b;
        }
        if (c > ans) {
            ans = c;
        }
        System.out.println(ans);
    }
}
