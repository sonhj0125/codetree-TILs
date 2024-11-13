import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[8];

        int sum = 0;
        int cnt = 0;

        for(int i=0; i<8; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
            cnt++;
        }

        double avg = (double)sum/cnt;

        System.out.printf("%.1f", avg);

    }
}