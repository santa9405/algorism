package chap02;

import java.util.Scanner;

// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
public class Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		
		int[] a = new int[num];
		
		for(int i=0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("모든 요소의 합계 : " + sumOf(a));
	}
}
