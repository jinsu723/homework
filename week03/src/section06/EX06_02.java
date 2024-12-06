package section06;
// 6-2
public class EX06_02 {
	public static void main(String[] args) {
		int[] arr = new int[4];  // 4칸짜리 배열 생성
		
		arr[0] = 1;  // 0번 인덱스에 1 저장
		arr[1] = 2;  // 1번 인덱스에 2 저장
		arr[2] = 3;  // 2번 인덱스에 3 저장
		arr[3] = 4;  // 3번 인덱스에 4 저장
		
		System.out.println("arr[0] = " + arr[0]);  // 0번 인덱스에 저장된 값 출력
		System.out.println("arr[1] = " + arr[1]);  // 1번 인덱스에 저장된 값 출력
		System.out.println("arr[2] = " + arr[2]);  // 2번 인덱스에 저장된 값 출력
		System.out.println("arr[3] = " + arr[3]);  // 3번 인덱스에 저장된 값 출력
	}
}
