import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=a; i<=b;) {
            System.out.print(i + " ");

            if(i%2 == 0) {
                i += 3;
            }
            else {
                i *= 2;
            }
        }

    }
}