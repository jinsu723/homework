// 5-6 : do while  문
package section05;

public class EX05_06 {	
	public static void main(String[] args) {
		int sum = 0;  // 변수 선언
		int i = 1;  // while문을 제어할 변수 선언
		
		do {  // 일단 한 번 실행
			sum += i;  // 변수에 i를 더해서 저장
			i++;  // i에 1을 더해 저장한다
		} while(i <= 10);  // i가 10보다 작거나 같을 동안
		System.out.println("합 : " + sum);  // 결과 출력
	}
}
