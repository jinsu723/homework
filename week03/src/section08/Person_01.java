package section08;
// 8-10 ~ 8-11
public class Person_01 {
	void introduce(String name, int age) {  // 메소드 선언(문자열 매개변수 1개, 정수형 매개변수 1개)
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");  // 메시지 출력
	}
	void hello() {  // 메소드 선언
		System.out.println("안녕하세요.");  // 메시지 출력
	}
	
	public static void main(String[] args) {  // 메인메소드
		Person_01 hong = new Person_01();  // 객체 생성
		hong.introduce("홍길동", 20);  // 문자열과 정수형 매개변수 넣어서 메소드 실행
		hong.hello();  // 메소드 실행
	}
}
