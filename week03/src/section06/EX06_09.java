package section06;

import java.util.Arrays;
import java.util.Comparator;

// 6-9
public class EX06_09 {
	public static void main(String[] args) {
		Integer[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};  // 배열 선언 후 값 넣어 저장
		
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr));  // 배열에 저장된 값을 문자열로 반환하여 출력
		
		Arrays.sort(arr, Comparator.reverseOrder());  // 배열에 저장된 값을 내림차순으로 정렬해주는 메소드 실행
		System.out.println("내림차순 정렬 : " + Arrays.toString(arr));  // 결과 출력
	}
}
