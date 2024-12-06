package section06;

import java.util.Arrays;

// 6-10
public class EX06_10 {
	public static void main(String[] args) {
		int[] arr01 = {1, 2, 3};  // 배열 선언 후 값 넣어 저장
		
		int[] arr02 = arr01;  // 배열 복사
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));  // 배열에 저장된 값을 출력
		
		arr02[1] = 10;  // arr02 배열의 1번 인덱스에 10을 넣어 저장
		
		System.out.println("arr02 배열 : " + Arrays.toString(arr01));  // 배열에 저장된 값 출력
		System.out.println("arr01 배열 : " + Arrays.toString(arr02));  // 베열에 저장된 값 출력
		// 배열의 참조값이 같기 때문에 하나의 값을 바꾸면 다 바뀐다
	}
}
