import java.io.*;
import java.util.*;

public class Main_2566_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;  //최댓값
        int row = 1;  //행
        int column = 1;  //열

        // 행과 열에 입력값을 넣어줄 for문
        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j<= 9; j++) {
                int num = Integer.parseInt(st.nextToken());   // StringTokenizer 은 문자열이므로 int로 형변환
                if (num > max) {
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
