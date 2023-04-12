package 코딩은체육과목입니다_25314;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		a = a/4;
		for (int i = 0; i < a; i ++) {
			bw.write("long ");
		}
		bw.write("int");
		
		br.close();
		bw.close();
		
	}

}
