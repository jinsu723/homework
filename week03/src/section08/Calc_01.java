package section08;
// 8-8 ~ 8-9
public class Calc_01 {
	void sum(int num1, int num2) {  // 메소드 선언(정수형 매개변수 2개)
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다.");  // 연산 및 메시지 출력
	}
	public static void main(String[] args) {  // 메인메소드
		Calc_01 calc = new Calc_01();  // 객체 생성
		calc.sum(5, 3);  // 매개변수 넣어서 메소드 실행
		calc.sum(10, 7);  // 메개변수 넣어서 메소드 실행
	}
}
