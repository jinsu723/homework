package section09;
// 9-5
public class Person {  // 클래스 선언
	String name;  // 필드 선언
	int age;  // 필드 선언
	
	Person(String n, int a){  // 매개변수를 받는 생성자 선언
		name = n;  // 필드 초기화
		age = a;  // 필드 초기화
	}
	
	void introduce() {  // 메소드 선언
		System.out.println("안녕하세요. 저는 " + age + "세 " + name + "입니다.");  // 메시지 출력
	}
}
