package section06;
// 6-14
public class EX06_14 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];  // 2행 3열의 크기를 갖는 2차원 배열 생성
		
		arr[0][0] = 1;  // 0행 0열에 1 저장
		arr[0][1] = 2;  // 0행 1열에 2 저장
		arr[0][2] = 3;  // 0행 2열에 3 저장
		
		arr[1][0] = 4;  // 1행 0열에 4 저장
		arr[1][1] = 5;  // 1행 1열에 5 저장
		arr[1][2] = 6;  // 1행 2열에 6 저장
		
		System.out.println("2차원 배열 : " + arr);  // 2차원 배열의 참조값 출력
		System.out.println("2차원 배열 1행 : " + arr[0]);  // 0번째 행의 참조값 출력 
		
		System.out.println("행의 크기 : " + arr.length);  // 행의 크기 출력
		
		System.out.println("1행의 열 크기 : " + arr[0].length);  // 0번째 행의 크기
		System.out.println("2행의 열 크기 : " + arr[1].length);  // 1번째 행의 크기
		
		System.out.println("arr[0][0] = "  + arr[0][0]);  // 0행 0열에 저장된 값 출력
	}
}
