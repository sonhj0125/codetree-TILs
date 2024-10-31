import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        if(m == 12 || m <= 2 && m != 0) {
            System.out.println("Winter");
        }
        else if(m >= 3 && m <= 5) {
            System.out.println("Spring");
        }
        else if(m >= 6 && m <= 8) {
            System.out.println("Summer");
        }
        else {
            System.out.println("Fall");
        }
    }
}