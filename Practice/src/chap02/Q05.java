package chap02;

import java.util.Scanner;

// 문제
// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.
public class Q05 {
	static void copy(int[] a, int[] b) {
		int length = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < length; i++)
			a[i] = b[b.length - i - 1];
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a의 요솟수 : ");
		int numa = stdIn.nextInt();
		int[] a = new int[numa];
		for(int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		
		System.out.print("b의 요솟수 : ");
		int numb = stdIn.nextInt();
		int[] b = new int[numb];
		for(int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : " );
			b[i] = stdIn.nextInt();
		}
		
		copy(a, b);
		
		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사");
		for(int i = 0; i < numa; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}