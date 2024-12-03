package December2024.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10988_팰린드롬인지_확인하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);

        // 팰린드롬 : 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 문자 ex) pop, level ....
        // StringBuilder 의 reverse() 사용
        if (s.equals(sb.reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
