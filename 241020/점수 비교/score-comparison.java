import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a_mat, a_eng, b_mat, b_eng;
        a_mat = sc.nextInt();
        a_eng = sc.nextInt();
        b_mat = sc.nextInt();
        b_eng = sc.nextInt();

        if(a_mat > b_mat && a_eng > b_eng) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }


    }
}