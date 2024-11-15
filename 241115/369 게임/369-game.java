import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        // 1부터 n까지 369 게임 진행
        // 3의 배수이거나 숫자에 3, 6, 9 중 하나라도 들어가 있는 경우에는 0을 출력
        // 그렇지 않다면 해당 숫자를 그대로 출력

        for(int i=1; i<=n; i++){
            if(i % 3 == 0) {
                System.out.print("0 ");
            }   
            else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
                System.out.print("0 ");
            }
            else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.print("0 ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}