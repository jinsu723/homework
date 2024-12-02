// 4-1 : if 문(2)
package section04;

import java.util.Scanner;

public class EX04_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import
		System.out.println("나이를 입력하세요");  // 입력값 요구
		
		int age = sc.nextInt();  // 입력받은 값을 변수에 저장
		if(age > 19) {  // 변수가 19보다 크면
			System.out.println("성인입니다.");  // 메시지 출력
		}
		System.out.println("프로그램을 종료합니다.");  // 메시지 출력
	}
}
