// 5-1 : for 문 (1)
package section05;

public class EX05_01 {
	public static void main(String[] args) {
		int sum = 0;  // 변수 선언
		
		for(int i = 1; i <= 10; i++) {  // 10번 반복
			sum += i;  // 변수에 i를 더해서 저장
		}
		System.out.println("합 : " + sum);  // 결과 출력
	}
}
