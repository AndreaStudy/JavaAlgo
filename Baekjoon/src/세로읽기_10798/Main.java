package 세로읽기_10798;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[][] ch = new char[5][15];
		int max = 0;
		
		for (int i = 0; i < ch.length; i++) {
			String str = br.readLine();
			if(max < str.length()) max = str.length();
			
			for (int j = 0; j < str.length(); j++) {
				ch[i][j] = str.charAt(j);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if(ch[j][i] == '\0') continue;
				sb.append(ch[j][i]);
			}
		}
		bw.write(sb.toString());
		
		br.close();
		bw.close();
		// char[][] 에서는 '\0' String[][] 에서는 null int[][] 에서는 0으로 초기화
	}

}
