// 2-30 : 데이터 입력받기
package section02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 입력 메소드 import
		
		System.out.println("나이를 입력해 주세요");  // 사용자에게 입력값 요구
		int age = scanner.nextInt();  // 정수형 변수 선언, 입력받은 값 저장
		System.out.printf("내 나이는 %d세 입니다.", age);  // 저장된 값 출력
	}
}
