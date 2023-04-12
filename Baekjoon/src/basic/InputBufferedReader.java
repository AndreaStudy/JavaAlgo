package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputBufferedReader {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		bw.write(str + "\n");
		
		int n = Integer.parseInt(br.readLine());
		n += 5;
		bw.write(n + "");
		
		br.close();
		bw.close();
	}
}
