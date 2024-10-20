import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        if(a >= b) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

        if(a > b) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

        if(b >= a) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        
        if(b > a) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

        if(a == b) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        
        if(a != b){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        
        }



    }
}