// 2-24 : 실수형<->정수형 형 변환하기
package section02;

public class EX02_24 {
	public static void main(String[] args) {
		double pie = 3.14;  // 실수형 변수 선언하고 값 저장
		int pieInt = (int)pie;  // 실수형 변수를 int형 변수로 선언하고 변환하여 저장
		System.out.println(pieInt);  // 변수에 저장된 값 출력

		int num = 100;  // 정수형 변수를 선언하고 저장
		double numD = (double)num;  // 실수형 변수를 선언하고 정수형 변수를 실수형 변수에 저장
		float numF = (float)100;  // float형 변수를 선언 후 정수형 변수를 float형으로 형 변환 후 저장
		System.out.println(numD);  // 변수에 저장된 값 출력
		System.out.println(numF);  // 변수에 저장된 값 출력

		int i = 99999999;  // 정수형 변수 선언하고 값 저장
		float f = (float) i;  // float형 변수를 선언 후 정수형 변수를 flaot형으로 형 변환 후 저장
		System.out.println(f);  // 변수에 저장된 값 출력
	}
}