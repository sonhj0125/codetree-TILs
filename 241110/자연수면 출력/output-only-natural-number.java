import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > 0) {
            for(int i=1; i<=b; i++){
                System.out.print(a);
            }
        }
        else {
            System.out.print(0);
        }
    }
}