package section08;
// 8-23
public class EX08_23 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		Person_03 kim = new Person_03();  // 객체 생성
		kim.setAge(-30);  // 매개변수로 -30을 넣어 메소드 실행
		kim.setAge(30);  // 메게변수로 30을 넣어 메소드 실행
		System.out.println("kim의 나이는" + kim.getAge() + "세입니다.");  // age값을 받을 메소드 실행 및 결과 출력
	}
}
