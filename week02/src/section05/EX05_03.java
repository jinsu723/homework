// 5-3 : 중첩 for 문
package section05;

public class EX05_03 {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {  // 8번 반복
			for(int j = 1; j <= 9; j++) {  // 9번 반복
				System.out.println(i + "X" + j + "=" + (i * j) + "\t");  // 결과 출력
			}
		}
	}
}
