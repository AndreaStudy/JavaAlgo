package ºº≈πº“ªÁ¿Âµø«ı_2720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int quater, dyme, nickel, peni = 0;
		for(int i = 0; i < a; i++) {
			int b = Integer.parseInt(br.readLine());
			quater = b/25;
			b -= (quater*25);
			dyme = b/10;
			b -= (dyme*10);
			nickel = b/5;
			peni = b-nickel*5;
			bw.write(quater +" "+dyme+" "+nickel+" "+peni+ "\n");
		}
		bw.close();
		br.close();
	
	}

}
