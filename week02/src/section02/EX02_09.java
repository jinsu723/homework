// 2-9 : 변수를 이용해 다른 변수에 복사하기
package section02;

public class EX02_09 {
	public static void main(String[] args) {
		int myAge = 20;  // 변수를 선언하고 값을 저장한다
		int yourAge = myAge;  // 변수를 새로 선언하고 myAge에 저장된 값을 저장한다

		System.out.println(myAge);  // 변수에 저장된 값을 출력한다
		System.out.println(yourAge);  // 변수에 저장된 값을 출력한다
	}
}