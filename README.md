# Java 입출력 및 문자열 처리 도구

## BufferedReader
### 정의
- 문자 입력 스트림을 효율적으로 읽기 위한 클래스
- 버퍼를 사용해 입력 성능 향상

### 주요 메서드
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine(); // 한 줄 읽기
br.close(); // 사용 후 닫기
```

### 특징
- 대량의 문자 데이터 읽기에 최적화
- 입력 속도가 빠름
- System.in과 함께 콘솔 입력에 자주 사용

## StringTokenizer
### 정의
- 문자열을 구분자(delimiter)를 기준으로 분리하는 클래스

### 주요 메서드
```java
StringTokenizer st = new StringTokenizer("1 2 3 4", " ");
while (st.hasMoreTokens()) {
    int num = Integer.parseInt(st.nextToken());
}
```

### 특징
- 문자열을 쉽게 분리
- 기본 구분자는 공백
- 다른 구분자 지정 가능
- split()보다 성능이 조금 더 좋음

## StringBuilder
### 정의
- 문자열을 효율적으로 조작하고 생성하기 위한 가변 문자열 클래스

### 주요 메서드
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello"); // 문자열 추가
sb.append(" ");
sb.append("World");
String result = sb.toString(); // 최종 문자열로 변환
```

### 특징
- 문자열 연산 시 메모리 효율적
- 문자열 수정이 잦은 경우 사용
- String보다 성능 우수
- 스레드 세이프하지 않음 (멀티스레드 환경 주의)

## 코딩 테스트에서의 활용 예시
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 입력 받기
        int n = Integer.parseInt(br.readLine());
        
        // 문자열 토큰화
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 결과 빌더에 저장
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(num * 2).append(" ");
        }
        
        // 최종 출력
        System.out.println(sb.toString());
        
        br.close();
    }
}
```
