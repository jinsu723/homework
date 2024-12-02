// 5-7 : continue 문
package section05;

public class EX05_07 {
	public static void main(String[] args) {
		int sum = 0;  // 변수 선언
		for(int i = 1; i <=100; i++) {  // 100번 반복
			if(i % 2 == 0) {  // i가 짝수라면
				continue;  // 다음 코드 실행
			}
			sum += i;  // 변수에 i를 더해 저장
		}
		System.out.println("짯수 합 : " + sum);  // 결과 출력
	}
}
