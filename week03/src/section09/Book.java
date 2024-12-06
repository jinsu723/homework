package section09;
// 9-11
public class Book {  // 클래스 선언
	String title = "제목없음";  // 필드 선언 및 초기화
	int series = 1;  // 필드 선언 및 초기화
	int page = 100;  // 필드 선언 및 초기화
	
	Book(){  // 기본생성자
		
	}
	
	Book(String t){  // 문자열만 매개변수를 받는 생성자 선언
		title = t;  // 필드 초기화
	}
	
	Book(String t, int p){  // 문자열과 정수형 순으로 매개변수를 받는 생성자 선언
		title = t;  // 필드 초기화
		page = p;  // 필드 초기화
	}
	
	Book(int s, String t){  // 정수형과 문자열 순으로 매개변수를 받는 생성자 선언
		series = s;  // 필드 초기화
		title = t;  // 필드 초기화
	}
}
