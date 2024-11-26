import java.io.*;
import java.util.StringTokenizer;

public class Main_10807_개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];   // 입력받은 정수 길이만큼의 배열 생성

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());  // 변환된 정수값을 배열의 i번째 요소로 저장
        }

        // 입력받은 정수가 배열안에 있는지 체크 후 있으면 count 변수에 개수 추가
        int b = Integer.parseInt(br.readLine());

        for(int j = 0; j < arr.length; j++){
            if(b == arr[j]) {
                count++;
            }
        }
        System.out.println(count);

        br.close();
        bw.flush();
        bw.close();
    }
}
