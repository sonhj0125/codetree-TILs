import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a>b) {
            System.out.println(a-b);
        }
        else {
            System.out.println(b-a);
        }


    }
}