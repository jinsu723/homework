package section08;

// 8-15
public class EX08_15 {  // 클래스 선언
	public static void main(String[] args) { // 메인메소드
		int[] nums = { 500, 200 }; // 배열 선언 및 값 저장
		Calc_03 calc = new Calc_03(); // 객체 생성
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다."); // 매개변수 넣어서 메소드 실행 및 메시지 출력
																	// 메소드 내에 출력 메소드가 없고 값만 전달해주기 때문에 메인메소드에서 출력
	}
}
