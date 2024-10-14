import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
    
        int a = sc.nextInt();
        sc.close();

        if(a % 2 == 0) { // a가 짝수라면 2로 나눠준다.
            a = a/2;
        }
        // 연달아 계산해야함.
        if(a % 2 != 0) { // a가 홀수라면 1을 더한 뒤 2로 나눠준다.
            a = (a + 1) / 2;
        }

        System.out.println(a);

    }
}