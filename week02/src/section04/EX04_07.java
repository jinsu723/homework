// 4-7 : if-else if 문(1)
package section04;

public class EX04_07 {
	public static void main(String[] args) {
		int favorite = 7;  // 변수 선언
		
		if(favorite < 5) {  // 변수가 5보다 작으면
			System.out.println("종하하는 숫자가 5보다 작습니다.");  // 메시지 출력
		} else if(favorite > 5) {  // 변수가 5보다 크면
			System.out.println("좋아하는 숫자는 5보다 큽니다.");  // 메시지 출력
		} else {  // 둘 다 아니라면
			System.out.println("좋아하는 숫자가 5입니다.");  // 메시지 출력
		}
	}
}
