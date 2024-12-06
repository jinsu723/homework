package section06;
// 6-6
public class EX06_06 {
	public static void main(String[] args) {
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};  // 배열 선언하고 값 저장
		
		int temp = 0;  // 값을 저장하기 위한 변수 선언
		
		for(int i=arr.length -1; i>0; i--) {  // 배열의 길이 -1만큼 반복
			for(int j=0; j< i; j++) {  // i의 값만큼 반복
				if(arr[j] > arr[j+1]) {  // 앞의 값이 뒤의 값보다 크다면
					temp = arr[j+1];  // 뒤의 값을 임시저장
					arr[j+1] = arr[j];  // 앞의 값을 뒤로 보내기
					arr[j] = temp;  // 임시저장한 값을 앞에 넣기
				}
			}
		}
		
		System.out.println("정렬 후 출력 : " );  // 메시지 출력
		for(int i=0; i<arr.length; i++) {  // 배열의 길이만큼 반복
			System.out.print(arr[i] + " ");  // 배열에 저장된 값 나열하기
		}
	}
}
