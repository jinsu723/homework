// 5-8 : break 문
package section05;

import java.util.Scanner;

public class EX05_08 {
	public static void main(String[] args) {
		int magicNumber = (int)(Math.random() * 50) + 1;  // 랜덤한 변수 생성
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import
		boolean isMatched = false;  // 맞췄는지 판단할 변수 선언
		
		for(int i = 0; i < 10; i++) {  // 10번 반복
			System.out.println("찾는 숫자를 입력 >> ");  // 메시지 출력
			int guess = sc.nextInt();  // 입력값 저장
			
			if(guess == magicNumber) {  // 숫자를 맞췄다면
				System.out.println((i+1) + "번째에 맞췄습니다!");  // 메시지 출력
				isMatched = true;  // 틀렸다는 메시지 출력 방지
				break;  // 탈출
			} else if(guess > magicNumber) {  // 입력한 수가 더 크다면
				System.out.println("맞춰야 할 숫자가 더 작습니다.");  // 메시지 출력
			} else if(guess < magicNumber) {  // 입력한 수가 더 작다면
				System.out.println("맞춰야 할 숫자가 더 큽니다.");  // 메시지 출력
			}
		}
		if(!isMatched) {  // 끝까지 맞추지 못했다면
			System.out.println("정답을 맞추지 못했습니다.");  // 메시지 출력
		}
	}
}
