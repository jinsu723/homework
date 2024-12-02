// 4-12 : switch 문(2) <break 활용>
package section04;

import java.util.Scanner;

public class EX04_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 입력메소드 import
		System.out.println("원하는 숫자를 입력하세요. (1~5)");  // 입력값 요구
		
		int num = sc.nextInt();  // 입력값 저장
		switch(num) {  // 변수의 값 판단
			case 5:  // 5라면
				System.out.println("5를 입력하였습니다.");  // 메시지 출력
				break; // 탈출
			case 4:  // 4라면
				System.out.println("4를 입력하였습니다.");  // 메시지 출력
				break;  // 탈출
			case 3:  // 3이라면
				System.out.println("3를 입력하였습니다.");  // 메시지 출력
				break;  // 탈출
			case 2:  // 2라면
				System.out.println("2를 입력하였습니다.");  // 메시지 출력
				break;  // 탈출
			case 1:  // 1이라면
				System.out.println("1를 입력하였습니다.");  // 메시지 출력
				break;  // 탈출
			default :  // 모두 아니라면
				System.out.println("1~5까지의 숫자를 입력하세요.");  // 메시지 출력
		}
	}
}
