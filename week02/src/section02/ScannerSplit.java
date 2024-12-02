// 2-31 : 데이터 입력하기
package section02;

import java.util.Scanner;

public class ScannerSplit {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);  // 입력메소드 import
			String name, address;  // 문자열 변수 2개 선언
			int age;  // 정수형 변수 선언
			double weight;  // 실수형 변수 선언
			
			System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요");  // 입력값 요구
			name = scanner.next();  // 문자열 입력값 받아 저장
			address = scanner.next();  // 문자열 입력값 받아 저장
			age = scanner.nextInt();  // 정수형 입력값 받아 저장
			weight = scanner.nextDouble();  // 실수형 입력값 받아 저장
			
			System.out.printf("당신의 이름은 %s입니다.%n", name);  // 저장된 값 출력
			System.out.printf("당신의 주소는 %s입니다.%n", address);  // 저장된 값 출력
			System.out.printf("당신의 나이는 %d세입니다.%n", age);  // 저장된 값 출력
			System.out.printf("당신의 체중은 %.1fkg입니다.%n", weight);  // 저장된 값 출력
	}
}
