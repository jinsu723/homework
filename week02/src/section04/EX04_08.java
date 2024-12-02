// 4-8 : if-else if 문(2)
package section04;

public class EX04_08 {
	public static void main(String[] args) {
		int favorite = 7;  // 변수 선언
		
		if(favorite > 5) {  // 변수가 5보다 크다면
			System.out.println("좋아하는 숫자가 5보다 큽니다.");  // 메시지 출력
		} else if (favorite == 7) {  // 변수가 7이라면
			System.out.println("좋아하는 숫자는 7입니다.");  // 메시지 출력
		}
	}
}
