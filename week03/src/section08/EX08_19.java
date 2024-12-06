package section08;
// 8-19
public class EX08_19 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		int money = 10000;  // 변수 선언 및 초기화
		
		Bus bus = new Bus();  // 객체 생성
		bus.take(money);  // 매개변수 넣어서 메소드 실행
	}
}
