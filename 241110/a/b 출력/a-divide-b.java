import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        // a/b에서 소수점을 구하는 방법
        // a를 b로 나눈 나머지에 10을 곱한 값을 b로 나눴을 때의 몫을 순서대로 적기
        
        // 예로, 1/7 = 0.142857143...
        // 나머지에 10을 곱한 값을 7로 나눴을 때의 몫을 계속 적으면...
        // 1*10을 7로 나누었을 때 몫은 1. 이때 나머지는 3
        // 3*10을 7로 나누었을 때 몫은 4. 이때 나머지는 2
        // 2*10을 7로 나누었을 때 몫은 2. 이때 나머지는 6
        // 6*10을 7로 나누었을 때 몫은 8. 이때 나머지는 4


        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        // 정수 부분을 먼저 출력
        System.out.print(a/b + ".");

        // a를 b로 나눈 나머지를 시작으로 소수점 자리를 하나씩 계산
        a %= b;
        for(int i = 0; i < 20; i++){
            // 나머지에 10을 곱한 값을 기준으로
            // b로 나누었을 때의 몫을 구한다.
            a *= 10;
            System.out.print(a/b);

            // a를 b로 나눈 나머지를 계속 갱신한다.
            a %= b;

        }

        

    }
}