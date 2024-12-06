package section08;
// 08-18
public class Bus {  // 클래스 선언
	void take(int m) {  // 메소드 선언(매개변수 정수)
		while(true) {  // 반복실행
			if(m < 3000) {  // 변수가 3000보다 작다
				System.out.println("교통카드를 충전하러 갑니다.");  // 메시지 출력
				return;  // 메소드 종료
			}
			System.out.println("버스를 탑니다.");  // 메시지 출력
			m -= 1250;  // 변수에서 1250을 빼서 저장
		}
	}
}
