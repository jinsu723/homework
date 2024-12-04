package section08;
// 8-6 ~ 8-7
public class Book {
	void count(int bookNum) {  // 메소드 선언 정수형 매개변수
		System.out.println("책은 " + bookNum  + "권 입니다.");  // 메시지 출력
	}
	
	public static void main(String[] args) {  // 메인메소드
		Book myBook = new Book();  // 객체 선언
		myBook.count(3);  // 매개변수 넣어서 메소드 실행
	}
}
