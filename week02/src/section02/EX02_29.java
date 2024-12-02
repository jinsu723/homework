// 2-29 : 강제 형 변환(3)
package section02;

public class EX02_29 {
	public static void main(String[] args) {
			float f1 = 12345.67f;  // 실수형 변수 선언하고 값 저장
			int i1 = (int)f1;  // 정수형 변수 선언하고 float형 변수를 정수형으롭 변환 후 저장
			System.out.println("[float -> int] f1의 값 : " + f1 + ", i1의 값 : " + i1);  // 저장된 값 출력
			
			double d1 = 12345.678;  // 실수형 변수 선언하고 값 저장
			int i2 = (int) d1;  // 정수형 변수 선언하고 double형 변수를 정수형으로 형 변환햐서 저장
			System.out.println("[double -> int] d1의 값 : " + d1 + ", f1의 값 : " + f1);  // 저장된 값 출력
	}
}
