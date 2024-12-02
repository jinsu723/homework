// 2-25 : 자동 형 변환(1)
package section02;

public class EX02_25 {
	public static void main(String[] args) {
		int num1 = 14;  // 정수형 변수를 선언하고 값을 저장한다
		double num2 = 3.14;  // 실수형 변수를 선언하고 값을 저장한다

		int num4 = (int) num2;  // 실수형 변수를 정수형 변수로 형 변환하여 저장한다

		System.out.println(num4);  // 변수에 저장된 값을 출력한다
	}
}