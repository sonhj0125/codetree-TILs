import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        if(a%2 ==0) { 
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

        if(b%2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }



    }
}