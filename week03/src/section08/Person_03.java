package section08;
// 08-22
public class Person_03 {  // 클래스 선언
	private int age;  // private 변수 선언
	
	void setAge(int num) {  // 변수를 변경할 수 있는 메서드 선언(매개변수 정수)
		if(num <= 0) {  // 변수가 0이하라면
			System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요.");  // 메시지 출력
			return;  // 메소드 종료
		} else {  // 변수가 0초과라면
			age = num;  // age에 입력받은 값 저장
		}
	}
	
	int getAge() {  // age 변수를 불러올 수 있는 메소드 선언
		return age;  // age에 저장된 값을 return
	}
}
