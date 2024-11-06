import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        sc.close();

        // 먼저, 정수가 2월인지 판단. ==> 2월만 예외로 28일까지 존재하기 때문
        // 7월에서 8월로 넘어가는 순간을 기점으로 홀수달과 짝수달에 해당하는 일 수가 달라짐
        // 7월보다 작거나 같은 경우에는 홀수달이 31일, 짝수달은 30일
        // 7월보다 크다면, 홀수달은 30일, 짝수달은 31일


        if(n == 2) {
            System.out.println("28");
        }
        else if(n <= 7){
            if(n % 2 == 1) {
                System.out.println("31");
            }
            else {
                System.out.println("30");
            }
        }
        else {
            if(n % 2 == 0) {
                System.out.println("31");
            }
            else {
                System.out.println("30");
            }
        }
    
    
    
    
    }
}