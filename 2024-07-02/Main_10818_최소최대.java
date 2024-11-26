import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main_10818_최소최대 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		Integer.parseInt(br.readLine());	//첫 줄 N 은 안쓰이므로 입력만 받는다.
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val>max) {
				max = val;
			}
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min + " " + max);
    }
    // 문제에서 모든 정수는 -1,000,000보다 크거나 같고, 
    // 1,000,000보다 작거나 같은 정수라고 되어있기 때문에 
    // 비교를 위해 max 에는 가장 작은 값으로, min 에는 가장 큰 값으로 초기화를 해줌
    // 그리고 반복문에서 각 토큰을 가져와 기존 max 의 값보다 큰지, 기존 min 의 값보다 작은지 비교하면서 수행하면 됨
}