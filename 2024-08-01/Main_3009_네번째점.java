import java.io.*;

public class Main_3009_네번째점 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 좌표 3개
		String[] coord_1 = br.readLine().split(" ");
		String[] coord_2 = br.readLine().split(" ");
		String[] coord_3 = br.readLine().split(" ");
        
		String x;
		String y;
        
		// x 좌표 비교
        // 1번 x좌표와 2번 x좌표 비교
        if (coord_1[0].equals(coord_2[0])) {
            x = coord_3[0];
        }
        // 1번 x좌표와 3번 x좌표 비교
        else if (coord_1[0].equals(coord_3[0])) {
            x = coord_2[0];
        }
        // 2번 x좌표와 3번 x좌표 비교
        else {
            x = coord_1[0];
        }
  
        // y 좌표 비교
        // 1번 y좌표와 2번 y좌표 비교
        if (coord_1[1].equals(coord_2[1])) {
            y = coord_3[1];
        }
        // 1번 y좌표와 3번 y좌표 비교
        else if (coord_1[1].equals(coord_3[1])) {
            y = coord_2[1];
        }
        // 2번 y좌표와 3번 y좌표 비교
        else {
            y = coord_1[1];
        }
		
		System.out.println(x + " " + y);
    }
}

// 문자열 비교
// == 연산자 : 두 문자열의 주소(참조)값이 같은지 비교, 두 객체가 메모리에서 동일한 위치를 가리키는지 확인
// equals() 메서드 : 두 문자열의 내용 비교, 두 문자열이 동일한 값을 가지는지 확인
