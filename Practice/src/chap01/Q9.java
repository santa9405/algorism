package chap01;

import java.util.Scanner;

// 문제
// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
// static int sumof(int a, int b)
public class Q9 {
	
	static int sumof(int a, int b) {
		
		int sum = 0;
		
		if(a > b) {
			for(int i=b; i<=a; i++) {
				sum += i;
			}
		}else {
			for(int i=a; i<=b; i++) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.println("정수 a, b 사이의 모든 정수의 합 : " + sumof(a, b));
		
	}

}