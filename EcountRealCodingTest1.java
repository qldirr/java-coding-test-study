import java.io.*;
import java.util.*;

public class EcountRealCodingTest1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 산의 수 입력
        int N = Integer.parseInt(br.readLine());

        // 산의 높이 배열 생성
        int[] heights = new int[N];

        // 산의 높이 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        // 하늘다리 설치 가능한 방법 수 계산
        int bridgeCount = 0;

        // 모든 가능한 시작점과 끝점에 대해 검사
        for (int start = 0; start < N; start++) {
            for (int end = start + 1; end < N; end++) {
                // 시작점과 끝점의 높이가 같은지 확인
                if (heights[start] == heights[end]) {
                    // 중간에 있는 모든 산의 높이 확인
                    boolean canBuild = true;
                    for (int mid = start + 1; mid < end; mid++) {
                        if (heights[mid] >= heights[start]) {
                            canBuild = false;
                            break;
                        }
                    }

                    // 하늘다리를 설치할 수 있다면 카운트 증가
                    if (canBuild) {
                        bridgeCount++;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(bridgeCount);
    }
}


//N개의 산이 일렬로 나열된 산맥이 있다. 산은 나열된 순서대로 1번부터 N번까지의 번호가 붙어있고 i번 산 높이는 Hi이다. 두 산을 잇는 하늘다리를 하나 설치하려고 할때 두산의 높이가 같아야하고 두 산 사이 모든 산들의 높이가 다리를 설치하려는 산의 높이보다 작아야한다. 하늘다리를 설치할 수 있는 서로다른 방법은 몇가지일까
//예를 들어 산 높이가 5 2 3 2 5 라고 한다. 높이가 2인 산은 3인 산이 가로막아 설치가 불가하고 높이가 5인 산은 사이에 가로막는 산이 없어 설치가 가능하다. 따라서 설치할 수 있는 하늘다리는 1개이다.
//    입력 : 첫째줄에 산의 수 N이 주어짐, 둘째 줄에 산 높이 H1,H2,...,HN이 공백을 두고 주어짐
//        * 2 <= N <= 300000
//        * 1 <= Hi <= 1000000000
//        * 입력받는 모든 수는 정수
