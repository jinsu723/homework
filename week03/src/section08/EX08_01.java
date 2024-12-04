package section08;
// 8-1
public class EX08_01 {
	public static void main(String[] agrs) {  // 메인메소드
		printHello();  // 메소드 실행(static 메소드라 객체 없이 실행)
	}
	
	static void printHello() {  // 메소드 선언
		System.out.println("안녕하세요.");  // 메시지 출력
		System.out.println("만나서 반갑습니다.");  // 메시지 출력
	}
}
