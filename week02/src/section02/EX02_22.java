// 2-22 : 정수형<->정수형 형 변환하기
package section02;

public class EX02_22 {
	public static void main(String[] args) {
		int i1 = 10;  // 정수형 변수를 선언하고 값 저장
		byte b1 = (byte)i1;  // byte형 변수에 정수형 변수를 형 변환하여 저장
		System.out.println(b1);  // 변수에 저장된 값 출력

		int i2 = 128;  // 변수 선언하고 값 저장
		byte b2 = (byte)i2;  // byte형 변수에 정수형 변수를 형 변환하여 저장
		System.out.println(b2);  // 변수에 저장된 값 출력
	}
}