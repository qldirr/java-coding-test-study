import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main_2439_별찍기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
        // 1 행부터 N 행까지 출력을 하기 위한 가장 큰 틀
        // 출력을 보면 전 문제(별 찍기 - 1)와는 다르게 공백이 1 행에 4개 출력, 2행에 3개 출력, ...
        // 즉, n 번째 행에는 N-n개의 공백이 출력되고, 별은 n 번째 행에 n 개가 출력
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				bw.write(' ');
			}
            // 별의 개수는 i 의 값만큼 출력하니 for문을 외부 for문 아래에 하나 더 사용
			for (int k = 1; k <= i; k++) {
				bw.write('*');
			}
            // 한 행 끝나면 개행 처리
			bw.newLine();
		}
		bw.flush();
		bw.close();
    }
}
