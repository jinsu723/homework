// 2-23 : 실수형<->실수형 형 변환하기
package section02;

public class EX02_23 {
	public static void main(String[] args) {
		double d1 = 1.0e100;  // 변수를 선언하고 값 저장
		float f1 = (float)d1;  // double형 변수를 float형 변수로 형 변화하고 저장
		System.out.println(f1);  // 저장된 값 출력

		double d2 = 1.0e-100;  // 변수 선언하고 값 저장
		float f2 = (float)d2;  // double형 번수를 float형 변수로 형 변환하고 저장
		System.out.println(f2);  // 저장된 값 출력
	}
}