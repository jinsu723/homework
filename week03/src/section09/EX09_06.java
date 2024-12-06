package section09;
// 9-6
public class EX09_06 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		Person p1 = new Person("김자바", 20);  // 객체 선언 및 필드 초기화
		Person p2 = new Person("이코딩", 40);  // 객체 선언 및 필드 초기화
		
		p1.introduce();  // p1객체 메소드 호출
		p2.introduce();  // p2객체 메소드 호출
	}
}
