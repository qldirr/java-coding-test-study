import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_27866_문자와문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		int n = Integer.parseInt(br.readLine())-1;
		
		br.close();
		
		System.out.println(st.charAt(n));
        // charAt()은 String타입의 문자열에서 해당 위치에 있는 문자만을 char타입으로 변환
        // 인덱스처럼 0부터 시작
    }
}
