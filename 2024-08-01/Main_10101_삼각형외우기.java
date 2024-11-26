import java.io.*;

public class Main_10101_삼각형외우기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a + b + c != 180) {   // 세 각의 합이 180이 아닐때
            System.out.print("Error");
        } else {     // 세 각의 합이 180 이고
            if (a == 60 && b == 60 && c == 60) {   // 세 각의 크기가 모두 60이면
                System.out.print("Equilateral");
            } else if (a == b || b == c || c == a) {   // 두 각이 같은 경우
                System.out.print("Isosceles");
            } else {    // 같은 각이 없는 경우
                System.out.print("Scalene");
            }
        }
    }    
}
