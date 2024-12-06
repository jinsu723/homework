package section09;
// 9-12
public class EX09_12 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		Book b1 = new Book();  // 기본생성자를 통한 객체 선언
		System.out.println("b1.title : " + b1.title);  // 메시지 출력
		System.out.println("b1.series : " + b1.series);  // 메시지 출력
		System.out.println("b1.page : " + b1.page);  // 메시지 출력
		
		Book b2 = new Book("멘토시리즈 자바");  // 문자열 하나만 받는 겍체 선언
		System.out.println("b1.title : " + b2.title);  // 메시지 출력
		System.out.println("b1.series : " + b2.series);  // 메시지 출력
		System.out.println("b1.page : " + b2.page);  // 메시지 출력
		
		Book b3 = new Book("신데렐라", 170);  // 문자열과 정수형 순으로 인수를 받는 객체 선언
		System.out.println("b1.title : " + b3.title);  // 메시지 출력
		System.out.println("b1.series : " + b3.series);  // 메시지 출력
		System.out.println("b1.page : " + b3.page);  // 메시지 출력
		
		Book b4 = new Book(5, "노인과 바다");  // 정수형과 문자열 순으로 인수를 받는 겍체 선언
		System.out.println("b1.title : " + b4.title);  // 메시지 출력
		System.out.println("b1.series : " + b4.series);  // 메시지 출력
		System.out.println("b1.page : " + b4.page);  // 메시지 출력
	}
}
