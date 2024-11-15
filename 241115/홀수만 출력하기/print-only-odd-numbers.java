import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 첫 번째 줄에 N개의 줄이 나올 것 이란 정수가 주어짐
        // 두 번째 줄부터 수들이 나옴
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int a = sc.nextInt();
            
            if(a % 2 == 1 && a % 3 == 0) {
                System.out.println(a);
            }
        }
    }
}