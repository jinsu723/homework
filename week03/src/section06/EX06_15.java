package section06;
// 6-15
public class EX06_15 {
	public static void main(String[] agrs) {
		int[][] arr = new int[5][5];  // 5행 5열의 크기를 갖은 2차원 배열 생성
		
		int count = 1;  // 수를 새어줄 변수 선언 및 초기화
		
		for(int i=0; i<5; i++) {  // 5번 반복 행
			for(int j=0; j<5; j++) {  // 5번 반복 열
				arr[i][j] = count++;  // 숫자를 1씩 올리면서 더하기
			}
		}
		
		
		for(int i=0; i<5; i++) {  // 행
			for(int j=0; j<5; j++) {  // 열
				System.out.print(arr[i][j] + " ");  // 결과 출력하기
			}
			System.out.println();  // 줄바꿈
		}
	}
}
