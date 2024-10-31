import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 영어점수 상관없이 수학 점수가 높다면, 더 높은 학생 출력
        // 만약, 수학 점수가 같다면 영어 점수가 더 높은 학생 출력
        Scanner sc = new Scanner(System.in);

        int math1, math2, eng1, eng2;
        math1 = sc.nextInt();
        eng1 = sc.nextInt();
        math2 = sc.nextInt();
        eng2 = sc.nextInt();

        if(math1 == math2) {
            if(eng1 > eng2) {
                System.out.println("A");
            }
            else {
                System.out.println("B");
            }
        }
        else if(math1 > math2) {
            System.out.println("A");
        }
        else {
            System.out.println("B");
        }
        



    }
}