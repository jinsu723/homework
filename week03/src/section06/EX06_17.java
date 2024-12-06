package section06;
// 6-17
public class EX06_17 {
	public static void main(String[] args) {
		int[] score = {90, 92, 93};  // 배열 생성하고 값 넣어 저장
		
		int sum = 0;  // 총합 저장할 변수 선언
		double avg = 0;  // 평균을 저장할 변수 선언
		
		for(int val : score) {  // 빠른for문으로 배열 둘러보기
			sum += val;  // 배열에 저장된 값을 총합에 누적 저장
		}
		
		avg = (double) sum / 3;  // 총합을 3으로 나누고 실수형으로 형 변환하여 저장
		
		System.out.println("총점 : " + sum + ", 평균 : " + avg);  // 결과 출력
	}
}
