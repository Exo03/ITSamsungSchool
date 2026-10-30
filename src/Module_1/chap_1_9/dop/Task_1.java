package Module_1.chap_1_9.dop;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        System.out.println(trianglePerimetr(x1, y1, x2, y2, x3, y3));
    }

    public static double segmentLength(int x1, int y1, int x2, int y2) {
        double l1 = Math.abs(y1 - y2);
        double l2 = Math.abs(x1 - x2);
        double ans = Math.sqrt(l1 * l1 + l2 * l2);
        return ans;
    }

    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3) {
        double l1 = segmentLength(x1, y1, x2, y2);
        double l2 = segmentLength(x2, y2, x3, y3);
        double l3 = segmentLength(x1, y1, x3, y3);
        return l1 + l2 + l3;
    }
}
