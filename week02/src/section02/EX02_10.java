// 2-10 : 2개의 변수에 저장된 데이터 바꾸기
package section02;

public class EX02_10 {
	public static void main(String[] args) {
		int myAge = 20;  // 변수를 선언하고 값을 저장한다
		int yourAge = 30;  // 변수를 선언하고 값을 저장한다
		int tempAge;  // 변수를 선언한다

		tempAge = myAge;  // 변수에 값을 저장
		myAge = yourAge;  // 변수에 있는 값을 새로 저장
		yourAge = tempAge;  // 변수에 있는 값을 새로 저장

		System.out.println(myAge);  // 변수에 저장된 값을 출력
		System.out.println(yourAge);  // 변수에 저장된 값을 출력
	}
}