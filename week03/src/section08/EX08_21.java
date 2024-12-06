package section08;
// 8-21
public class EX08_21 {  // 클래스 선언
	public static void main(String[] agrs) {  // 메인메소드
		Person_02 kim = new Person_02();  // 객체 생성
		kim.age = -30;  // 클래스에서 선언된 변수에 값을 저장
		System.out.println("kim의 나이는 " + kim.age + "세입니다.");  // 메시지 출력
	}
}
