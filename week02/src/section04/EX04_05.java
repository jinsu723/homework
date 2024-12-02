// 4-5 : if-else문 활용(1)
package section04;

public class EX04_05 {
	public static void main(String[] args) {
		int a = 4;  // 변수 선언하고 값 저장
		int b = 10;  // 변수 선언하고 값 저장
		int max = 0;  // 변수 선언하고 값 저장
		
		if(a > b) {  // a가 b보가 크다면
			max = a;  // 변수에 a 저장
		} else {  // 아니라면
			max = b;  // 변수에 b 저장
		}
		
		System.out.println(a + "와(과) " + b + "중에 큰 수는 " + max + "입니다.");  // 결과 출력
	}
}
