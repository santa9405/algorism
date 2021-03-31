package chap02;

import java.util.Scanner;

// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.

public class Q4 {
	static void copy(int[] a, int[] b) {
		for(int i = 0; i < b.length; i++)
			a[i] = b[i];
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		int num = stdIn.nextInt();
		
		int[] b = new int[num];
		int[] a = new int[num];

		for(int i = 0; i < num; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		copy(a, b);
		
		System.out.println("배열 b의 모든 요소를 배열 a에 복사");
		for(int i = 0; i < b.length; i++) {
			System.out.println("b" + i + "번째 인덱스 값 : " + b[i] + " / a" + i + "번째 인덱스 값 : " + a[i]);
		}
	}
}