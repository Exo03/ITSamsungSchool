package Module_1.nested_loops;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int x, max = 0;
        do{
            x = scanner.nextInt();
            if(x != 0){
                if(x > max){
                    max = x;
                    cnt = 1;
                }else if(x == max){
                    cnt++;
                }
            }
        }while(x != 0);
        System.out.println(cnt);
    }
}
