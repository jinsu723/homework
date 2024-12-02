// 4-11 : switch 문(2) <break 제외>
package section04;

public class EX04_11 {
	public static void main(String[] args) {
		int num  = 7;  // 변수 선언
		
		switch(num) {  // 변수의 값 판단
		case 1:  // 변수가 1이라면
			System.out.println("num은 1입니다.");  // 메시지 출력
		case 7:  // 변수가 7이라면
			System.out.println("num은 7입니다.");  // 메시지 출력
		default :  // 둘 다 아니라면(중간에 break가 없어서 무조건 실행됨)
			System.out.println("num은 1도 7도 아닙니다.");  // 메시지 출력
		}
	}
}
