// 2-6 : 소수점 출력하기
package section02;

public class PrintfPt {
	public static void main(String[] args) {
		System.out.printf("%.1f", 1.1234567);  // 소수점 1자리까지 출력한다
		System.out.println();  // 줄바꿈
		System.out.printf("%.2f", 1.1234567);  // 소수점 2자리까지 출력한다
		System.out.println();  // 줄바꿈
		System.out.printf("%.3f", 1.1234567);  // 소수점 3자리까지 출력한다
		System.out.println();  // 줄바꿈
		System.out.printf("%.4f", 1.1234567);  // 소수점 4자리까지 출력한다
		System.out.println();  // 줄바꿈
		System.out.printf("%.5f", 1.1234567);  // 소수점 5자리까지 출력한다
	}
}