import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 남자는 숫자 0, 여자는 숫자 1
        Scanner sc = new Scanner(System.in);

        int gender = sc.nextInt();
        int age = sc.nextInt();

        if(gender == 0) {   // 남자인 경우
            if(age >= 19) { // 성인인 경우
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }
        }
        else if(gender == 1) {  // 여성인 경우
            if(age >= 19) {    // 성인인 경우
               System.out.println("WOMAN");
            }
            else {
                System.out.println("GIRL");
            }
        }
        else {
            System.out.println("");
        }

    }
}