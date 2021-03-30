package chap02;

import java.util.Arrays;
import java.util.Scanner;

// 문제
// 배열 요소를 역순으로 정렬하는 과정을 하나 하나 나타내는 프로그램을 작성하세요.
public class Q02 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	// 배열 a의 요소 값을 나타냄
	static void print(int[] a) {
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	static void reverse(int[] a) {
		print(a);
		for(int i = 0; i < a.length / 2; i++) {
			//System.out.print(Arrays.toString(a));
			System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) + "]을 교환합니다.");
			swap(a, i, a.length - i - 1);
			print(a);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		/*for(int i = 0; i < num; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();*/
		
		reverse(x);
		//System.out.println(Arrays.toString(x));
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
