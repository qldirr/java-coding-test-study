import java.io.*;
import java.util.*;

public class Main_2869_달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
 
		int day = (length - down) / (up - down);
        // 잔여 블럭이 있는 경우(나머지 존재)
		if ((length - down) % (up - down) != 0)
			day++;
 
		System.out.println(day);
    }
    
}

// 기본적으로 만약에 정점에 도달 할 때 미끄러지지 않는다는 조건이 없다면 다음과 같이 쉽게 짤 수 있다.
// length / ( up - down )
 

// 즉, up 과 down 의 차를 length 에서 나누면 잔여블록과 상관 없이 무조건 몫만 반환하게 된다.
// 근데, 문제에서 분명히 정점에 도달하면 미끄러지지 않는다는 조건이 붙어있다.
// 즉, 잔여 블록이 없으면 문제가 안되지만, 만약에 잔여블록이 있다면? 그러면 한 번 다시 미끄러진 다음에 올라가야 한다는 것이다.

 
// 이로써 up-down 의 차이 값보다 작은 나머지가 존재하면 다음날 up 때 올라가야하는 경우가 발생한다.
// 결과적으로 down 을 뺌으로서 up 과 down 의 차이를 나눈 몫은 최소한의 일(日) 수가 된다.

 
// 그리고 나머지에 대해서는 다음과 같은 두 가지 상황이 생긴다.

// ( length - down ) % ( up - down ) 가 정확하게 0 으로 떨어지는 경우
// ( length - down ) % ( up - down ) 가 나머지가 남는 경우
 
// 위 예시로 본다면 아래와 같다.

// ( 7 - 1 ) % ( 3 - 1 ) = 0
// ( 8 - 1 ) % ( 3 - 1 ) = 1
 

// 전체 길이에서 down 값을 빼고, up - down 을 나누면  둘 다 몫은 3 이다.
// ( 7 - 1 ) / ( 3 - 1 ) = 3
// ( 8 - 1 ) / ( 3 - 1 ) = 3

// 그러나 길이가 8일 경우 down 을 빼고 ( up - down ) 을 했는데 나머지가 생긴다.
// 이유는 up 과 down 의 차이 값으로 정확히 나누어 떨어지는 것이 아니라 아직 잔여 블럭이 남았기 때문이다.
// 그렇기 때문에 down 을 한 번 더 하게 되고, 자연스레 up 또한 한 번 더 하게 되는 것이다.
// 즉, 하루가 더 소요 되는 것이다.