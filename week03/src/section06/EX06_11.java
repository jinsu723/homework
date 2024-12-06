package section06;

import java.util.Arrays;

// 6-11
public class EX06_11 {
	public static void main(String[] args) {
		int[] card = {1, 6, 4, 5, 3, 2};  // 배열을 생성하고 값을 넣어 저장
		int[] newCard = new int[card.length];  // 먼저 선언한 배열의 길이를 갖는 배열을 새로 생성
		
		for(int i=0; i<card.length; i++) {  // 배열의 길이만큼 반복
			newCard[i] = card[i];  // 먼저 만든 배열에 저장된 값을 새로 만든 배열에 저장
		}
		
		System.out.println("card 배열 : " + Arrays.toString(card));  // 먼저 만든 배열에 저장된 값 출력
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));  // 뒤에 만든 배열에 저장된 값 출력
	}
}
