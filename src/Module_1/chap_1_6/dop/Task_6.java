package Module_1.chap_1_6.dop;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("impossible");
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("right");
        } else if ((a * a + b * b > c * c && c >= a && c >= b) || (a * a + c * c > b * b && b >= a && b >= c) || (b * b + c * c > a * a && a >= c && a >= b)) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}
