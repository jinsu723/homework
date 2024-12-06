package section07;
// 7-6
public class EX07_06 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		Car01 c = new Car01();  // 객체 선언
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다.");  // 필드에 저장된 값 출력
		
		c.wheel = 5;  // 필드 초기화
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다.");  // 필드에 저장된 값 출력
	}
}
