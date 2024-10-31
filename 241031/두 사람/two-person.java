import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 두 사람 중 한 사람이라도 19세 이상이면서 남자라면 1 출력
        int age1 = sc.nextInt();
        char gen1 = sc.next().charAt(0);

        int age2 = sc.nextInt();
        char gen2 = sc.next().charAt(0);

        if(age1 >= 19 && gen1 == 'M' || age2 >= 19 && gen2 == 'M') {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }



    }
}