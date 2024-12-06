package section08;
// 08-14
public class Calc_03 {  // 클래스 선언
	public int sum(int[] nums) {  // 메소드 선언(매개변수 배열)
		int result = 0;  // 결과 저장할 변수 선언 및 초기화
		for(int i=0; i<nums.length; i++) {  // 받은 배열의 길이만큼 반복
			result += nums[i];  // 결과값 더해서 저장
		}
		
		return result;  // 결과값 return
	}
}
