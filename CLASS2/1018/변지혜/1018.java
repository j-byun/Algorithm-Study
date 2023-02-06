import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		
		outer : for (int result = m; result <= n; result++) {
			
			if (result == 1 || result == 2) {
				bw.write(result + "\n");
				continue;
				
			} else {
				for (int i = 2; i < result; i++) {
					if (result % i == 0) {
						continue outer;
					}
				}
				bw.write(result + "\n");
				
			}
			
		}
		bw.flush();
		bw.close();
		
		
	}

}
