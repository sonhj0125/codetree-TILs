import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for(int i=n; i<=5*n; i+= n){
            System.out.print(i + " ");
        }

    }
}