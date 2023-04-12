package °ö¼À_2588;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = b%10;
		int d = b%100/10;
		int e = b/100;
		c = c*a;
		d = d*a;
		e = e*a;
		b = b*a;
		bw.write(c+"\n"+d+"\n"+e+"\n"+b);
		br.close();
		bw.close();
	}
	
}
