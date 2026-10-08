package Module_1.chap_1_4;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        int i =  scanner.nextInt();
        String mask = "1".repeat(32-i) + "0".repeat(i);
        System.out.println(a & Long.parseUnsignedLong(mask, 2));
    }
}
