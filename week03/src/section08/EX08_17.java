package section08;
// 8-17
public class EX08_17 {  // 클래스 선언
	public static void main(String[] args) {  // 메인메소드
		int[] studentA = {97, 53};  // 배열을 선언하고 값 넣기
		int[] studentB = {95, 66};  // 배열을 선언하고 값 넣기
		
		MidTerm mid = new MidTerm();  // 객체 생성
		int sumA = mid.score(studentA);  // 변수 선언 및 매개변수 넣어서 값을 받아 저장
		int sumB = mid.score(studentB);  // 변수 선언 및 매개변수 넣어서 값을 받아 저장
		
		if(sumA > sumB) {  // A학생의 총점이 B학생의 총점보다 더 높다
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");  // 메시지 출력
		} else if(sumA < sumB) {  // B학생의 총점이 A학생의 총점보다 더 높다
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");  // 메시지 출력
		} else {  // 두 학생의 총점이 같다
			System.out.println("두 학생의 중간고사 총점이 같습니다.");  // 메시지 출력
		}
	}
}
