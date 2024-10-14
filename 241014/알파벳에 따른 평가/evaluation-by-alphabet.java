import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
    
        char c = sc.next().charAt(0);
        sc.close();

        if(c == 'S'){
            System.out.println("Superior");
        }
        else if(c == 'A'){
            System.out.println("Excellent");
        }
        else if(c == 'B') {
            System.out.println("Good");
        }
        else if(c == 'C'){
            System.out.println("Usually");
        }
        else if(c == 'D') {
            System.out.println("Effort");
        }
        else {
            System.out.println("Failure");
        }
    
    
    
    
    
    
    }
}