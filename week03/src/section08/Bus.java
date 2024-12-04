package section08;
// 08-18 ~ 08-19
public class Bus {
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
	
	public static void main(String[] args) {  // 메인메소드
		int money = 10000;  // 변수 선언 및 초기화
		
		Bus bus = new Bus();  // 객체 생성
		bus.take(money);  // 매개변수 넣어서 메소드 실행
	}
}
