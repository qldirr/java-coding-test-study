import java.io.*;
import java.util.*;

public class Main_5086_배수와약수 {
    public static void main(String[] args) throws IOException{
        String f = "factor\n";   // 약수
		String m = "multiple\n";   // 배수
		String n = "neither\n";   // 둘 다 아님
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
 
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			if(first == 0 && second == 0) break;
			
			if(second % first == 0) {   // 첫 번째 숫자가 두 번째 숫자의 약수
				sb.append(f);
			}
			else if(first % second == 0) {    // 첫 번째 숫자가 두 번째 숫자의 배수
				sb.append(m);
			}
			else {    // 둘다 아님
				sb.append(n);
			}
			
		}
		System.out.println(sb);
    }
}
