package Module_1.chap_1_7;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int ans = 0;
        while (a / 2 > 0) {
            a /= 2;
            ans++;
        }
        System.out.println(ans + 1);
    }
}
