import java.io.*;
import java.util.*;

class EcountCodingTest1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 파싱
        int N = Integer.parseInt(st.nextToken());  // 카드 개수
        int S = Integer.parseInt(st.nextToken());  // 목표 합
        int K = Integer.parseInt(st.nextToken());  // 김이카의 카드

        // 카드 배열 입력 받기
        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 결과 계산
        int result = countSelectionCases(N, S, K, cards);
        System.out.println(result);
    }

    // 경우의 수 계산 메서드
    public static int countSelectionCases(int N, int S, int K, int[] cards) {
        int count = 0;

        // 모든 카드 조합 탐색 (비트마스킹 사용)
        for (int i = 0; i < (1 << N); i++) {
            int sum = K;  // 김이카의 카드를 기본 합에 포함

            // 현재 조합 확인
            for (int j = 0; j < N; j++) {
                // 현재 비트가 1이면 해당 카드 선택
                if ((i & (1 << j)) != 0) {
                    sum += cards[j];
                }
            }

            // 합이 목표 합과 같으면 경우의 수 증가
            if (sum == S) {
                count++;
            }
        }

        return count;
    }
}


//김이카는 정수 K가 적힌 카드를 가지고 있다
//김이카가 가지고 있는 카드를 제외하고 정수가 적힌 N개의 카드가 있다
//김이카는 이 카드 중 몇 장을 골라 김이카의 카드와 고른 카드들에 적힌 정수의 합이 S가 되도록 하려고 한다. 카드를 고르는 장 수는 제한이 없고 카드를 한장도 안골라도 된다. 김이카가 카드를 고를 수 있는 경우의 수를 구해라
//입력: 첫째줄에 N, S, K가 순서대로 공백을 두고 주어짐, 그 다음 줄에 카드에 적힌 정수 a1, a2,...., aN 이 공백을 두고 주어짐
//        * 1<= N <= 20
//        * -20000 < = S <= 20000
//        * -10000 <= K <= 10000
//        * -1000 <= ai <= 1000
//        * 입력에서 주어지는 모든 수는 정수이다