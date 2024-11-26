import java.io.*;
import java.util.*;

public class Main_2798_블랙잭 {
 public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());   // 카드 개수
		int M = Integer.parseInt(st.nextToken());   // 넘지않아야 하고 최대한 가까워야 할 정수
 
		int[] arr = new int[N];
 
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(arr, N, M);
		System.out.println(result);
	}
 
	
	// 탐색
	static int search(int[] arr, int N, int M) {
		int result = 0;
 
		// 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
		for (int i = 0; i < N - 2; i++) {
			
			// 첫 번째 카드가 M 보다 크면 skip
			if(arr[i] > M) continue;
			
			// 두 번째 카드는 첫 번째 카드 다음부터 N - 1 까지만 순회
			for (int j = i + 1; j < N - 1; j++) {
 
				// 두 번째 카드와 첫 번째 카드의 합이 M보다 크면 skip
				if(arr[i] + arr[j] > M) continue;
				
				// 세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
				for (int k = j + 1; k < N; k++) {
					
					// 3개 카드의 합 변수 temp
					int temp = arr[i] + arr[j] + arr[k];
					
					// M과 세 카드의 합이 같다면 temp return 및 종료 
					if (M == temp) {	
						return temp;
					}
					
					// 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱신 
					if(result < temp && temp < M) {
						result = temp;
					}
				}
			}
		}
		
		// 모든 순회를 마치면 result 리턴 
		return result;
 }   
}

// 브루트 포스 (Brute Force) : 난폭한(무식한) 힘이라는 의미 그대로 어떤 값을 찾아내기(또는 목적을 달성하기) 위해 무차별적으로 대입해보는 방법, 가능한 모든 경우의 수를 대입해보며 조건에 만족하는 값만을 찾아낼 수 있다
