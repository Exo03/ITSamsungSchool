package Module_1.chap_1_4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String mask = "0".repeat(31-n) + "1" + "0".repeat(n);
        System.out.println(Long.parseUnsignedLong(mask, 2));
    }
}
