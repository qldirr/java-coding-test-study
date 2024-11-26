import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main_2438_별찍기1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
        // 1 행부터 N 행까지 출력을 하기 위한 가장 큰 틀의 반복문
        // 1 행에 1개 출력, 2행에 2개 출력, ... 즉, n 번째 행에는 n개가 출력
        // 그러면 i 가 행을 의미하니 i 의 값만큼 반복해서 출력
		for (int i = 1; i <= N; i++) {
            //내부 for문의 j 는 i 의 값만큼 반복
            // 일단 한 행(i)당 j 의 반복 횟수만큼 출력
			for (int j = 1; j <= i; j++) {
				bw.write('*');
			}
            // 한 행이 끝나면 개행 처리
			bw.newLine();
		}
		bw.flush();
		bw.close();
    }
}
