package section06;

import java.util.Scanner;

// 6-16
public class EX06_16 {
	public static void main(String[] args) {  
		int[][] lotto = {{2, 6, 11, 33, 42, 44},  // 배열 생성 및 값 저장
			             {1, 6, 17, 22, 24, 33},
			             {7, 16, 24, 33, 42, 44},
			             {11, 27, 32, 34, 43, 46},
			             {6, 17, 22, 24, 33, 41}};
		
		Scanner scan = new Scanner(System.in);  // 입력메소드 import
		String myNum = "";  // 입력받을 변수 선언
		System.out.println("당첨 숫자 6개를 연속으로 입력해주세요. >>");  // 입력 요구
		myNum = scan.next();  // 입력받은 문자열을 저장
		
		boolean isWin = false;  // 이겼는지 졌는지 알려줄 논리형 변수 선언
		
		for(int i=0; i<lotto.length; i++) {  // 배열의 행의 길이만큼 반복
			String lottoNumber = "";  // 번호 초기화
			
			for(int j=0; j<lotto[i].length; j++) {  // 배열의 길이만큼 반복
				lottoNumber += lotto[i][j];  // 로또 번호 문자열로 누적 생성
			}
			if(myNum.equals(lottoNumber)) {  // 입력한 값과 로또 번호가 일치하는지 확인
				isWin = true;  // 맞으면 true 저장하기
				break;  // 탈출
			}
		}
		
		if(isWin) {  // 이겼다면
			System.out.println(myNum + " 번호 당첨!!");  // 축하
		} else {  // 졌다면
			System.out.println(myNum + " 번호는 당첨되지 못했습니다.");  // 패배 알려주기
		}
		
		scan.close();  // 자원 닫기
		
	}
}
