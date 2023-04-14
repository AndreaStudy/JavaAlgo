package 소트인사이드_1427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = br.readLine().toCharArray();
		Arrays.sort(ch);
		String result = new String(ch);
		StringBuffer sb = new StringBuffer(result);
		System.out.println(sb.reverse().toString());
	}

}
