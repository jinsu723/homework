// 2-27 : 강제 형 변환(2)
package section02;

public class EX02_27 {
	public static void main(String[] args) {
		int i = 10;  // 정수형 변수 선언 후 값 저장
		byte b = (byte) i;  // byte형 변수 선언 후 실수형 값 형 변환 후 저장
		System.out.println("[int -> byte] i의 값 : " + i + "b의 값 : " + b);  // 저장된 변수 출력

		int j = 100;  // 정수형 변수 선언 후 값 저장
		byte c = (byte)j;  // byte형 변수 선언 후 실수형 값 형 변환 후 저장
		System.out.println("[int -> byte] j의 값 : " + j + "c의 값 : " + c);  // 저장된 변수 출력
	}
}