import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a == 5) {
            System.out.println("A");
        }
        else if(a%2 == 0) {
            System.out.println("B");
        }
        else {
            System.out.println("");
        }

    }
}