package section07;
// 7-15
public class EX07_15 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		Student02 stu1 = new Student02();  // 객체 생성
		stu1.studentName = "김고이";  // 필드 초기화
		stu1.hello();  // 메소드 호출
		System.out.println("학교는 " + Student02.schoolName + "입니다.");  // 메시지 출력
		Student02.goToSchool();  // 메소드 호출
		
		Student02 stu2 = new Student02();  // 객체 생성
		stu2.studentName = "김고삼";  // 필드 초기화
		stu2.hello();  // 메소드 호출
		System.out.println("학교는 " + Student02.schoolName + "입니다.");  // 메시지 출력
		Student02.goToSchool();  // 메소드 호출
	}
}
