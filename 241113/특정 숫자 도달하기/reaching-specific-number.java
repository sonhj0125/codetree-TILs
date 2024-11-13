import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;
        // 실수 avg에 실수 sum을 cnt로 나눈 값 저장 = 평균

        // 10개의 정수를 입력받기
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        // 10개의 정수 중 250 이상의 수가 나올 때까지의 수의 합과 개수 구하기
        for(int i=0; i<10; i++) {
            if(arr[i] >= 250) {
                break;
            }
            sum += arr[i];
            cnt++;
        }

        // 평균 구하기
        double avg = (double) sum / cnt;

        // 출력
        System.out.printf("%d %.1f", sum, avg);

    }
}