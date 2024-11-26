import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9086_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String name[] = new String[n];
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			name[i] = str.substring(0,1)+str.substring(str.length()-1,str.length());	
		}
		br.close();
		for(int i=0;i<n;i++) {
			System.out.println(name[i]);	
		}
    }
    // String substring(int beginIndex, int endIndex) 
    // String의 beginIndex번째 값부터 (endIndex-1)번째 값까지 가져옴
}
