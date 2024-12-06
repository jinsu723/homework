package section06;

import java.util.Arrays;

// 6-13
public class EX06_13 {
	public static void main(String[] args) {
		int[] card = {1, 6, 4, 5, 3, 2};  // 배열을 생성하고 값 넣어 저장하기
		int[] newCard = new int[card.length];  // 먼저 만든 배열의 길이를 갖는 새로운 배열 생성
		
		System.arraycopy(card, 0, newCard, 0, card.length);  // System 클래스에서 제공하는 깊은 복사 메소드 실행
		
		System.out.println("card 배열 : " + Arrays.toString(card));  // 먼저 만든 배열에 저장된 값 출력하기
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));  // 뒤에 만든 배열에 저장된 값 출력하기
	}
}
