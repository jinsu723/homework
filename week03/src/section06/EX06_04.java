package section06;
// 6-4
public class EX06_04 {
	public static void main(String[] args) {
		int[] numbers = new int[10];  // 10칸짜리 정수형 배열 생성
		
		for(int i=0; i<numbers.length; i++) {  // 배열의 길이만큼 반복
			numbers[i] = (int)(Math.random() * 30) + 1;  // 배열 안에 랜덤한 숫자를 하나씩 넣어서 저장한다
		}
		
		int sum = 0;  // 총합 저장할 변수 선언
		for(int i=0; i<numbers.length; i++) {  // 배열의 길이만큼 반복
			if(numbers[i] % 2 == 0) {  // 배열의 저장된 수가 짝수라면
				sum += numbers[i];  // 총합에 더해서 저장
			}
		}
		
		for(int i=0; i<numbers.length; i++) {  // 배열의 길이만큼 반복
			System.out.println(numbers[i] + " ");  // 배열에 저장된 값을 하나씩 출력
		}
		
		System.out.println();  // 줄 띄우기
		System.out.println("배열의 짝수들의 합 : " + sum);  // 결과 출력
	}
}
