package basic;

import java.util.Scanner;

public class InputBasicString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		System.out.println(input1+ " : "+input2);
		sc.close();
	}
	
}
