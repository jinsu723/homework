// 2-21 : 형 변환하기
package section02;

public class EX02_21 {
	public static void main(String[] args) {
		int num1 = 11;  // 정수형 변수 선언하고 값 저장
		double num2 = 3.14;  // 실수형 변수 선언하고 값 저장
		double num1Change = (double)num1;  // 정수형 값을 실수형 변수로 형변환하여 저장

		System.out.println("num1 : " + num1);  // 저장된 변수 출력
		System.out.println("num1Change : " + num1Change);  // 저장된 변수 출력
		System.out.println(num1Change + num2);  // 저장된 변수를 + 연산하여 출력
		System.out.println((int)1.23);  // 실수를 정수형으로 형 변환하여 출력
	}
}