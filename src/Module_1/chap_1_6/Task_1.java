package Module_1.chap_1_6;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 0 && x < 10) {
            System.out.println("DIGIT");
        } else if (x >= 10 && x < 100) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}
