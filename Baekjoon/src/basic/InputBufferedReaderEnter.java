package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class InputBufferedReaderEnter {

	public static void main(String[] args) throws IOException {
		//		BufferedReader의 불편한 점
		//		엔터와 띄어쓰기를 구분해야 함.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 한줄 에 수 3개를 입력 받는 경우
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		// 엔터로 구분되어 있는 경우
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		
		System.out.println(a + b + c + d + e + f);
		
		// 1차원 배열에 N개의 수 입력받기
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2차원 배열에 수 입력 받기
		int height = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		
		int[][] arr2 = new int[height][width];
		for (int y = 0; y < height; y++) {
			st = new StringTokenizer(br.readLine());
			for (int x = 0; x < width; x++) {
				arr2[y][x] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		br.close();
		bw.close();
		
		
	}

}
