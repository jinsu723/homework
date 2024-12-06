package section09;
// 9-7
public class Phone_01 {  // 클래스 선언
	String brand;  // 필드 선언
	int series;  // 필드 선언
	String color = "검정색";  // 필드 선언 및 초기화
	
	Phone_01(String b, int s, String c){  // 매개변수를 받는 생성자 선언
		brand = b;  // 필드 초기화
		series = s;  // 필드 초기화
		color = c;  // 필드 초기화
	}
	
	void PhoneInfo() {  // 메소드 선언
		System.out.println(color + " " + brand + " " + series);  // 메시지 출력
	}
}
