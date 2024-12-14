import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        // 0일을 기점으로 2일마다 교실 청소
        // 3일마다 복도 청소
        // 12일마다 화장실 청소
        // 날짜가 겹치는 날에는 주기가 더 긴 것 우선
        // 시작 날인 0일에는 청소x

        int n = sc.nextInt();
        int cnt2 = 0, cnt3 = 0, cnt12 = 0;

        // 각 날짜마다 확인
        for(int i = 1; i <= n; i++) {
            // 주기가 가장 긴 12일 부터
            if(i % 12 == 0) {
                cnt12++;
            }
            else if(i % 3 == 0) {
                // 12일 주기에 들어오지 않을 때, 3일 주기에 들어오는지
                cnt3++;
            }
            else if(i % 2 == 0) {
                // 3일 주기에 들어오지 않을 때, 2일 주기에 들어오는지
                cnt2++;
            }
        }

        System.out.println(cnt2 + " " + cnt3 + " " + cnt12);

    }
}