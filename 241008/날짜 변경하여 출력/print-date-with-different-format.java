import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        // java에서 useDelimiter를 사용할 경우, "."이 아닌 "\\."를 적어야함.
        // useDelimiter 안에 적어야 하는 내용은 실제 정규 표현고이기에
        // .을 문자 그대로 사용하고 싶을 시 escape String "\" 을 붙여야함.

        int yyyy, mm, dd;

        yyyy = sc.nextInt();
        mm = sc.nextInt();
        dd = sc.nextInt();
        sc.close();

        System.out.println(mm + "-" + dd + "-" + yyyy);
    }
}