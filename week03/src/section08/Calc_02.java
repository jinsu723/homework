package section08;
// 8-12
public class Calc_02 {  // 클래스 선언
	void sum(int[] nums) {  // 메소드 선언(배열 매개변수)
		int result = 0;  // 변수 선언 및 초기화
		for(int i=0; i<nums.length; i++) {  // 배열의 길이만큼 반복
			result += nums[i];  // 값들을 더해서 저장한다
		}
		
		System.out.println("숫자들의 합은 " + result + "입니다.");  // 메시지 출력
	}
}
