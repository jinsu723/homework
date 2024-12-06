package section09;
// 9-3
public class Snack_02 {  // 클래스 선언
	int price;  // 필드 선언
	
	Snack_02(int p){  // 생성자 선언
		price = p;  // 필드 초기화
	}
	
	void info() {  // 메소드 선언
		System.out.println("과자의 가격은 " + price + "입니다.");  // 메시지 출력
	}
}
