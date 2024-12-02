// 5-2 : for 문(2)
package section05;

public class EX05_02 {
	public static void main(String[] args) {
		int sum = 0;  // 변수 선언
		
		for(int i = 1; i <= 100; i++) {  // 100번 반복
			if(i % 2 == 0) {  // i가 짝수라면
				sum += i;  // 변수에 i를 더해서 저장
			}
		}
		System.out.println("합 : " + sum);  // 결과 출력
	}
}
