package 무엇의약자일까_15904;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		String target = "UCPC";
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (target.charAt(j) == input[i]) {
				j++;
			}
			if (j == 4) {
				System.out.println("I love UCPC");
				return;
			}
		}
		
		System.out.println("I hate UCPC");
		
		br.close();
		
	}

}
