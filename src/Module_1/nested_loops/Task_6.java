package Module_1.nested_loops;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int x, max = 1;
        int[] pull = new int[2];
        do{
            x = scanner.nextInt();
            if(x != 0){
                if(cnt == 0){
                    pull[0] = x;
                    cnt++;
                }else if(cnt == 1){
                    if(x != pull[0]){
                        pull[1] = x;
                        cnt++;
                    }
                }else{
                    if(x > pull[1] && pull[1] > pull[0]){
                        pull[0] = pull[1];
                        pull[1] = x;
                        cnt++;
                    }else if(x < pull[1] && pull[1] < pull[0]){
                        pull[0] = pull[1];
                        pull[1] = x;
                        cnt++;
                    }else{
                        if(cnt > max){
                            max = cnt;
                        }
                        cnt = 1;
                        pull[0] = pull[1];
                        if(x != pull[0]){
                            pull[1] = x;
                            cnt++;
                        }
                    }
                }
            }else{
                if(cnt > max){
                    max = cnt;
                    cnt = 1;
                }
            }
        }while(x != 0);
        System.out.println(max);
    }
}
