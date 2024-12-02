// 4-6 : if-else 문 활용(2)
package section04;

import java.util.Scanner;

public class EX04_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import
		System.out.println("나이를 입력하세요.");  // 입력 요구
		
		int age = sc.nextInt();  // 입력값 저장
		  
		if(age > 19) {  // 변수가 19보다 크다면
			System.out.println("성인입니다.");  // 메시지 출력
		} else {  // 아니라면
			System.out.println("미성년자입니다.");  // 메시지 출력
		}
	}
}
