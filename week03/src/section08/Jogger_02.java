package section08;
// 8-4 ~ 8-5
public class Jogger_02 {
	String name;  // 문자열 변수 선언
	
	void run() {  // 메소드 선언
		System.out.println("run run run!");  // 메시지 출력
	}
	
	void sayName() {  // 메소드 선언
		System.out.println("제 이름은 " + name + "입니다.");  // 메시지 출력
	}
	public static void main(String[] args) {  // 메인메소드
		Jogger_02 jogger = new Jogger_02();  // 객체 생성
		jogger.name = "길진수";  // 문자열 변수에 값 넣기
		jogger.sayName();  // 메소드 실행
		jogger.run();  // 메소드 실행
	}
}
