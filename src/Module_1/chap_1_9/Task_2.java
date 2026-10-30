package Module_1.chap_1_9;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sumOfSeven(a, b));
    }

    public static int sumOfSeven(int a, int b) {
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0 && i > 9 && i < 100) {
                ans += sumOfDigits(i);
            }
        }
        return ans;
    }

    public static int sumOfDigits(int n) {
        int ans = 0;
        int t = n;
        while (t > 0) {
            ans += t % 10;
            t /= 10;
        }
        return ans;
    }
}
