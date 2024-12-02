// 4-9 : if-else if 문(3)
package section04;

import java.util.Scanner;

public class EX04_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 입력메소드 import
		System.out.println("나이를 입력하세요.");  // 입력값 요구
		int age = sc.nextInt();  // 입력값 저장
		if(age > 19) {  // 변수가 19보다 크면
			System.out.println("성인입니다.");  // 메시지 출력
		} else if(age > 13) {  // 변수가 13보다 크면
			System.out.println("청소년입니다.");  // 메시지 출력
		} else if(age > 6) {  // 변수가 6보다 크면
			System.out.println("어린이입니다.");  // 메시지 출력
		} else {  // 위 조건이 다 아니라면
			System.out.println("유아입니다.");  // 메시지 출력
		}
	}
}
