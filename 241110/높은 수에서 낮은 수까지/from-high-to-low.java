import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) { // a가 큰 수 인경우
            for(int i=a; i>=b; i--){
                System.out.print(i + " ");
            }
        }
        else {
            for(int i=b; i>=a; i--) {
                System.out.print(i + " ");
            }
        }
    }
}