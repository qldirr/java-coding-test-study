import java.io.*;
import java.util.*;

class EcountCodingTest2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 각 숫자의 등장 횟수를 저장할 HashMap
        Map<Integer, Integer> countMap = new HashMap<>();

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        // 등장 횟수가 1인 숫자만 남기기
        long uniqueCount = countMap.values().stream()
                .filter(count -> count == 1)
                .count();

        System.out.println(uniqueCount);
    }
}


//정수가 N개가 주어진다. 이때 정수 중 중복되는 값을 삭제하고 남은 정수의 개수 출력해라
//입력 : 첫째줄에는 정수의 개수 N이 주어진다, 둘째 줄에 N개의 정수 v1, v2, ..., vn 이 공백을 두고 주어짐
//        * 1 <= N <= 10000
//        * -10000 <= vi <= 10000