import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n;
        int cnt = 0;

        for(int i=1; i<=10; i++){
            n = sc.nextInt();

            if(n % 2 == 1) {
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}