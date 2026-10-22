package Module_1.chap_1_6.dop;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        if (m < 1 || m > 12 || d < 1) {
            System.out.println(-1);
            return;
        }
        int ans = 0;
        ans += (m - 1) * 30;
        if (m > 2) {
            ans -= 2;
        }
        switch (m) {
            case 1:
                if (d > 31) {
                    System.out.println(-1);
                    return;
                }
                break;
            case 2:
                if (d > 28) {
                    System.out.println(-1);
                    return;
                }
                ans += 1;
                break;
            case 3:
                if (d > 31) {
                    System.out.println(-1);
                    return;
                }
                ans += 1;
                break;
            case 4:
                if (d > 30) {
                    System.out.println(-1);
                    return;
                }
                ans += 2;
                break;
            case 5:
                if (d > 31) {
                    System.out.println(-1);
                    return;
                }
                ans += 2;
                break;
            case 6:
                if (d > 30) {
                    System.out.println(-1);
                    return;
                }
                ans += 3;
                break;
            case 7:
                if (d > 31) {
                    System.out.println(-1);
                    return;
                }
                ans += 3;
                break;
            case 8:
                if (d > 31) {
                    System.out.println(-1);
                    return;
                }
                ans += 4;
                break;
            case 9:
                if (d > 30) {
                    System.out.println(-1);
                    return;
                }
                ans += 5;
                break;
            case 10:
                if (d > 31) {
                    System.out.println(-1);
                    return;
                }
                ans += 5;
                break;
            case 11:
                if (d > 30) {
                    System.out.println(-1);
                    return;
                }
                ans += 6;
                break;
            case 12:
                if (d > 31) {
                    System.out.println(-1);
                    return;
                }
                ans += 6;
                break;
        }
        ans += d;
        System.out.println(365 - ans);
    }
}
