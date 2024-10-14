import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
    
        int temp = sc.nextInt();
        sc.close();

        if(temp < 0){
            System.out.println("ice");
        }
        else if(temp >= 100){
            System.out.println("vapor");
        }
        else {
            System.out.println("water");
        }

    
    
    }

}