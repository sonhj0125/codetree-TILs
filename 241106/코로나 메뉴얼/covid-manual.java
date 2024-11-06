import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        char ch1 = sc.next().charAt(0);
        int temp1 = sc.nextInt();

        char ch2 = sc.next().charAt(0);
        int temp2 = sc.nextInt();

        char ch3 = sc.next().charAt(0);
        int temp3 = sc.nextInt();
        sc.close();

        // A가 2명 이상인지 판단하기
        if(ch1 == 'Y' && temp1 >= 37) {
            // 첫 번째 사람이 A라면, 남은 두 사람 중 한 사람이라도 A인지?
            if((ch2 == 'Y' && temp2 >= 37) || (ch3 == 'Y' && temp3 >= 37)) {
                System.out.println("E");
            }
            else {
                System.out.println("N");
            }
        }
        else {
            // 첫 번째 사람이 A가 아니라면, 남은 두 사람 모두 A여야 함.
            if((ch2 == 'Y' && temp2 >= 37) && (ch3 == 'Y' && temp3 >= 37)) {
                System.out.println("E");
            }
            else {
                System.out.println("N");
            }
        }
        
        
        



    }
}