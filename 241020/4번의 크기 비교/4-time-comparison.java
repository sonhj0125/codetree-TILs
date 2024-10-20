import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        
        int a,b,c,d,e;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        sc.close();

        System.out.println(a > b ? 1 : 0);
        System.out.println(a > c ? 1 : 0);
        System.out.println(a > d ? 1 : 0);
        System.out.println(a > e ? 1 : 0);



    }
}