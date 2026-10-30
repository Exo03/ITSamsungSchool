package Module_1.chap_1_9;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfDigits(n));
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
