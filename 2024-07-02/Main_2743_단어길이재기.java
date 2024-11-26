import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2743_단어길이재기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		br.close();
				
		System.out.println(st.length()); 
    }
}
