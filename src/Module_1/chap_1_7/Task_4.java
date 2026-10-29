package Module_1.chap_1_7;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = 0;
        while (a - b >= 0) {
            a -= b;
            ans++;
        }
        System.out.println(ans + " " + a);
    }
}
