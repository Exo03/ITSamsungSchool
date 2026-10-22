package Module_1.chap_1_6;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 10 == 1 && x % 100 != 11) {
            System.out.println(x + " TORT");
        } else if ((x % 10 == 2 && x % 100 != 12) || (x % 10 == 3 && x % 100 != 13) || (x % 10 == 4 && x % 100 != 14)) {
            System.out.println(x + " TORTA");
        } else {
            System.out.println(x + " TORTOV");
        }
    }
}
