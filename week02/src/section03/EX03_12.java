// 3-12 : 복합 대입 연산자
package section03;

public class EX03_12 {
	public static void main(String[] args) {
		int x = 10;  // 변수 선언하고 값 저장
		int y = 1;  // 변수 선언하고 값 저장

		y += x;  // y에 x를 더해서 저장
		System.out.println(y);  // 저장된 값 출력

		y *= x;  // y에 x를 곱해서 저장
		System.out.println(y);  // 저장된 값 출력

		y %= x;  // y에 y나누기 x의 나머지를 저장
		System.out.println(y);
	}
}
