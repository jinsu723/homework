package section08;
// 8-13
public class EX08_13 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		int nums[] = {100, 100};  // 배열 선언 및 값 넣기
		Calc_02 calc = new Calc_02();  // 객체 생성
		calc.sum(nums);  // 매개변수 넣어서 메소드 실행
	}
}
