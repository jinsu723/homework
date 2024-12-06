package section06;
// 6-5
public class EX06_05 {
	public static void main(String[] args) {
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};  // 문자형 배열 선언하고 값 저장
		String myWord = "";  // 문자열 변수 선언
		
		for(int i=0; i<cards.length; i++) {  // 배열의 길이만큼 반복
			int word = cards[i];  // 배열의 저장된 값 하나씩 정수형으로 바꿔서 보기
			
			if((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) {  // 만약 배열에 저장된 값이 영문자라면
				myWord += (char)word;  // 문자형으로 형 변환하고 문자열에 저장
			}
		}
		
		System.out.println("단어 : " + myWord);  // 결과 출력
	}
}
