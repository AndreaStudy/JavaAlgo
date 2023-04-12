package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class InputBufferedReaderEnter {

	public static void main(String[] args) throws IOException {
		//		BufferedReader�� ������ ��
		//		���Ϳ� ���⸦ �����ؾ� ��.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// ���� �� �� 3���� �Է� �޴� ���
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		// ���ͷ� ���еǾ� �ִ� ���
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		
		System.out.println(a + b + c + d + e + f);
		
		// 1���� �迭�� N���� �� �Է¹ޱ�
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2���� �迭�� �� �Է� �ޱ�
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
