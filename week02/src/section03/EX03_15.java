// 3-15 : 논리 연산자
package section03;

public class EX03_15 {
	public static void main(String[] args) {
		boolean b1 = true;  // 변수 선언하고 값 저장
		boolean b2 = false;  // 변수 선언하고 값 저장
		boolean b3 = true;  // 변수 선언하고 값 저장
		boolean b4 = false;  // 변수 선언하고 값 저장

		System.out.println("###논리곱###");  // 메시지 출력
		System.out.println(b1 && b2);  // b1과 b2가 true인가
		System.out.println(b1 && b3);  // b1과 b3가 true인가
		System.out.println(b2 && b4);  // b2와 b4가 true인가
		System.out.println();  // 줄바꿈

		System.out.println("###논리곱###");  // 메시지 출력
		System.out.println(b1 || b2);  // b1또는 b2가 true인가
		System.out.println(b1 || b3);  // b1또는 b3가 true인가
		System.out.println(b2 || b4);  // b2또는 b4가 true인가
		System.out.println();

		System.out.println("###배타적 논리합###");  // 메시지 출력
		System.out.println(b1 ^ b2);  // b1와 b2가 다른 값인가
		System.out.println(b1 ^ b3);  // b1과 b3가 다른 값인가
	}
}
