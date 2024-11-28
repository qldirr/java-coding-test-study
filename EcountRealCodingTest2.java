import java.io.*;
import java.util.*;

public class EcountRealCodingTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 암호문 입력
        String cipherText = br.readLine();

        // 매칭 정보의 개수 입력
        int n = Integer.parseInt(br.readLine());

        // 매칭 정보를 저장할 맵
        Map<Character, Character> matchMap = new HashMap<>();

        // 매칭 정보 입력
        for (int i = 0; i < n; i++) {
            String[] match = br.readLine().split(" ");
            char from = match[0].charAt(0);
            char to = match[1].charAt(0);
            matchMap.put(from, to);
        }

        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 암호문을 해독하는 과정
        for (char ch : cipherText.toCharArray()) {
            result.append(decryptCharacter(ch, matchMap));
        }

        // 결과 출력
        System.out.println(result.toString());
    }

    private static char decryptCharacter(char ch, Map<Character, Character> matchMap) {
        Set<Character> visited = new HashSet<>();
        char current = ch;

        while (true) {
            // 이미 방문한 문자인 경우 무한 루프에 빠진 것
            if (visited.contains(current)) {
                return '?';
            }
            visited.add(current);

            // 매칭되는 문자가 있는 경우
            if (matchMap.containsKey(current)) {
                current = matchMap.get(current);
            } else {
                // 매칭되는 문자가 없을 경우
                return current;
            }
        }
    }
}

//암호문과 암호문을 해독하기 위한 문자 매칭 정보가 주어짐.
//문자 매칭 정보는 특정문자, 매칭되는 문자로 구성되어 있고, 이는 특정 문자를 매칭되는 문자로 해독 가능함을 의미한다.
//특정 문자에 매칭되는 문자는 고유하며 여러 개로 매칭되지 않는다.
//암호문의 각 문자는 매칭 정보에 따라 특정한 문자로 매칭될 수 있으며 매칭되는 문자가 있다면 반드시 해당 문자로 변환해 평문을 구해야 한다.
//이때, 변환된 문자와 매칭되는 또 다른 문자가 있을 수 있으며, 최종적으로 매칭되는 문자가 없을때 까지 매칭 정보를 이용해 문자를 변환하는 과정을 반복해야 한다.
//암호문의 각 문자마다, 매칭되는 문자가 없을 경우 원래 문자 그대로 사용하며, 문자를 변환하는 과정을 영원히 반복한다면 ?로 대체한다.
//입력 : 첫째줄에 알파벳과 공백으로 이뤄진 암호문이 주어짐, 둘째줄에 매칭정보의 총 개수인 정수 n이 주어짐(1 <= n <= 52), 이후 n줄에 각 줄마다 특정 문자와 매칭될 문자를 공백으로 구분해 나열됨(특정 문자와 매칭될 문자는 알파벳으로 이루어져있음)

// 입력 예시
//xpyyaq pcbuXt
//9
//x H
//a o
//p e
//y z
//z l
//q r
//r q
//b o
//X n

// ======>>>>>>> Hello? ecount