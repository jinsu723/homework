package section08;
// 08-14 ~ 08-15
public class Calc_03 {
	public int sum(int[] nums) {  // 메소드 선언(매개변수 배열)
		int result = 0;  // 결과 저장할 변수 선언 및 초기화
		for(int i=0; i<nums.length; i++) {  // 받은 배열의 길이만큼 반복
			result += nums[i];  // 결과값 더해서 저장
		}
		
		return result;  // 결과값 return
	}
	
	public static void main(String[] args) {  // 메인메소드
		int[] nums = {500, 200};  // 배열 선언 및 값 저장
		Calc_03 calc = new Calc_03();  // 객체 생성
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");  // 매개변수 넣어서 메소드 실행 및 메시지 출력
																	// 메소드 내에 출력 메소드가 없고 값만 전달해주기 때문에 메인메소드에서 출력
	}
}
