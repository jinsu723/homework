// 4-10 : switch 문(1)
package section04;

public class EX04_10 {
	public static void main(String[] args) {
		int num = 7;  // 변수 선언
		
		switch(num) {  // 변수의 값 판단
		case 1:  // 변수가 1이라면
			System.out.println("num은 1입니다.");  // 메시지 출력
			break;  //  탈출
		case 7:  // 변수가 7이라면
			System.out.println("num은 7입니다");  // 메시지 출력
			break;  // 탈출
		default :  // 해당사항이 없다면
			System.out.println("num은 1도 7도 아닙니다.");  // 메시지 출력
		}
	}
}
