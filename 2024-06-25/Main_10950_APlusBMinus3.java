import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main_10950_APlusBMinus3 {
    public static void main(String[] args) throws IOException {
        // 배열을 따로 생성하여 저장했다가 다시 출력하는 방식보다는 StringBuilder 에 계산한 식을 넣어준 뒤 나중에 한 번에 출력해주는 방식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
 
		System.out.println(sb);
    }
}
