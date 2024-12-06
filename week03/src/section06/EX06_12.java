package section06;

import java.util.Arrays;

// 6-12
public class EX06_12 {
	public static void main(String[] args) {
		int[] card = {3, 1, 4, 5, 10};  // 배열을 선언하고 값 넣어 저장
		
		int[] newCard = Arrays.copyOf(card, card.length);  // 먼저 만든 배열의 길이와 값을 깊은복사 해주는 메소드 실행
		
		System.out.println("card 배열 : " + Arrays.toString(card));  // 먼저 만든 배열에 저장된 값 출력
		
		card[1] = 10;  // 먼저 만든 배열의 값 변경
		
		System.out.println("card 배열 : " + Arrays.toString(card));  // 먼저 만든 배열에 저장된 값 출력
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));  // 뒤에 만든 배열에 저장된 값 출력
		// 깊은 복사를 하면 하나의 값이 바뀌어도 다른 배열의 값은 바뀌지 않는다
	}
}
