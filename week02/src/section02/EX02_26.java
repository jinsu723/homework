// 2-26 : 자동 형 변환(2)
package section02;

public class EX02_26 {
	public static void main(String[] args) {
		int i = 100;  // 정수형 변수 선언하고 값 저장하기
		char c = 'a';  // 문자형 변수 선언하고 값 저장하기
		int j = c;  // 정수형 변수 선언하고 유니코드 값 저장
		double d = i;  // 실수형 변수에 정수형 값 저장

		System.out.println("int형 변수 j의 값 : " + j);  // 저장된 변수 출력
		System.out.println("double형 변수 d의 값 : " + d);  // 저장된 변수 출력
	}
}