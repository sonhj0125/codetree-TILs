import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int b, a;
        b = sc.nextInt();
        a = sc.nextInt();

        int i = b;
        while(i>=a) {
            System.out.print(i + " ");
            i-=2;
        }

    }
}