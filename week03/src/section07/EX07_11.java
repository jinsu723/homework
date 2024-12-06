package section07;
// 7-11
public class EX07_11 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		Family father = new Family();  // 객체 선언
		Family son = new Family();  // 객체 선언
		
		father.address = "인천";  // 객체의 필드 초기화
		System.out.println(son.address);  // 필드 출력
	}
}
