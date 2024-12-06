package section06;
//6-3
public class EX06_03 {
	public static void main(String[] args) {
		int[] intArray = new int[5];  // 정수형 5칸짜리 배열 생성
		String[] strArray = new String[5];  // 문자열 5칸짜리 배열 생성
		
		int[] varArray = {1, 2, 3, 4, 5};  // 정수형 배열 만들고 바로 값 저장
		
		System.out.println("intArray [0] = " + intArray[0]);  // 정수형 배열 0번 인덱스에 저장된 값 출력
		System.out.println("intArray [1] = " + intArray[1]);  // 정수형 배열 1번 인덱스에 저장된 값 출력
		
		System.out.println("strArray [0] = " + strArray[0]);  // 문자열 배열 0번 인덱스에 저장된 값 출력
		System.out.println("strArray [0] = " + strArray[0]);  // 문자열 배열 1번 인덱스에 저장된 값 출력
		
		System.out.println("varArray [0] = " + varArray[0]);  // 값을 저장한 정수형 배열 0번 인덱스에 저장된 값 출력
		System.out.println("varArray [0] = " + varArray[0]);  // 값을 저장한 정수형 배열 1번 인덱스에 저장된 값 출력
	}
}
