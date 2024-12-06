package section06;

import java.util.Arrays;

// 6-8
public class EX06_08 {
	public static void main(String[] args) {
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};  // 배열 선언 후 값 넣어 저장하기
		
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr));  // 베열에 저장된 을 문자열로 반환하여 출력
		
		Arrays.sort(arr);  // 배열에 저장된 값들을 오름차순으로 정리해주는 메소드 실행
		System.out.println("오름차순 정렬 : " + Arrays.toString(arr));  // 결과 출력
	}
}
