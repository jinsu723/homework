// 5-4 : 이등변 삼각형 만들기
package section05;

public class EX05_04 {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {  // 7번 반복
			for(int j = 0; j < 7 - i; j++) {  // 7번 반복
				System.out.print(" ");  // 공백 출력
			}
			
			for(int k = 0; k < (2*i) + 1; k++) {  // 2*i번 출력
				System.out.print("*");  // *출력
			}
			System.out.println();  // 줄바꿈
		}
	}
}
