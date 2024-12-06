package section09;
// 9-10
public class EX09_10 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		Phone_02 p1 = new Phone_02("갤럭시", 1, "흰색");  // 객체 선언
		Phone_02 p2 = new Phone_02("갤럭시", 1);  // 오버로딩을 이용하여 매개변수가 다른 생성자 호출
		
		p1.phoneInfo();  // 메소드 호출
		p2.phoneInfo();  // 메소드 호출
	}
}
