package section08;
// 08-16
public class MidTerm {  // 클래스 선언
	public int score(int[] score) {  // 메소드 선언(매개변수 배열)
		int result = 0;  // 결과를 저장할 변수 선언 및 초기화
		for(int i=0; i<score.length; i++) {  // 배열의 길이만큼 반복
			result += score[i];  // 값을 더해서 저장
		}
		return result;  // 저장된 결과를 return
	}
}
