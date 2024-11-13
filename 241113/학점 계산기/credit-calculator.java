import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] grade = new double[n];
        double sum = 0;

        // 첫번째 줄에는 평균학점을 반올림하여 소수 첫째자리까지 출력
        // 두번째 줄에는 평균학점에 해당하는 등급 출력
        for(int i=0; i<n; i++){
            grade[i] = sc.nextDouble();
            sum += grade[i];
        }

        double avg = (double)sum/n;
        System.out.printf("%.1f\n", avg);

        if(avg >= 4.0) {
            System.out.println("Perpect");
        }
        else if(avg >= 3.0) {
            System.out.println("Good");
        }
        else {
            System.out.println("Poor");
        }

    }
}