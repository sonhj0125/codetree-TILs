import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        sc.close();

        // 4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년
        // 단, 예외적으로 100으로 나누어 떨어지되, 400으로 나누어 떨어지지 않는 해는 평년
        // 윤년이 true, 평년이 false

        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    
    
    
    
    
    }
}