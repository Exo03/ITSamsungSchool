package Module_1.chap_1_7;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int ans = 0;
        while (a / 10 > 0) {
            a /= 10;
            ans++;
        }
        System.out.println(ans + 1);
    }
}
