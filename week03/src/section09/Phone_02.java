package section09;
// 9-9
public class Phone_02 {  // 클래스 선언
	String brand;  // 필드 선언
	int series;  // 필드 선언
	String color = "검정색";  // 필드 선언 및 초기화
	
	Phone_02(String b, int s){  // 매개변수가 2개인 생성자 선언
		brand = b;  // 필드 초기화
		series = s;  // 필드 초기화
	}
	
	Phone_02(String b, int s, String c){  // 매개변수가 3개인 생성자 선언
		brand = b;  // 필드 초기화
		series = s;  // 필드 초기화
		color = c;  // 필드 초기화
	}
	
	void phoneInfo() {  // 메소드 선언
		System.out.println(color + " " + brand + " " + series);  // 메시지 출력
	}
}
