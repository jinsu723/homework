// 2-28 : 강제 형 변환(2)
package section02;

public class EX02_28 {
	public static void main(String[] args) {
		double d1 = 1.1234;  // 실수형 변수 선언하고 값 저장
		float f1 = (float) d1;  // double형 변수를 float형 변수로 형 변환 수 값 저장
		System.out.println("[double -> float] d1의 값 : " + d1 + ", f1의 값 : " + f1);  // 저장된 값 출력

		double d2 = 1.0e-50;  // 실수형 변수 선언하고 값 저장
		float f2 = (float) d2;  // double형 변수를 float형 변수로 형 변환 수 값 저장
		System.out.println("[double -> float] d2의 값 : " + d2 + ", f2의 값 : " + f2);  // 저장된 값 출력

		double d3 = 1.0e100;  // 실수형 변수 선언하고 값 저장
		float f3 = (float)d3;  // double형 변수를 float형 변수로 형 변환 수 값 저장
		System.out.println("[double -> float] d3의 값 : " + d3 + ", f3의 값 : " + f3);  // 저장된 값 출력

		double d4 = 9.123456789;  // 실수형 변수 선언하고 값 저장
		float f4 = (float) d4;  // double형 변수를 float형 변수로 형 변환 수 값 저장
		System.out.println("[double -> float] d4의 값 : " + d4 + ", f4의 값 : " + f4);  // 저장된 값 출력
	}
}