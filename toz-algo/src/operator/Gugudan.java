package operator;

import java.util.Scanner;

public class Gugudan {
	
	public String calc(int dan){
			 String result = ""; // 문자열 타입 초기화 방법
			 for (int i = 1; i < 10 ; i++) {
				 result = dan+" * "+i+" = "+dan*i+"\n";
			}
			 return result;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gugudan gugudan = new Gugudan(); // 객체생성
		System.out.println("구구단 : 출력할 단을 입력(단,2~9)");
		int dan = scanner.nextInt();
		String result = gugudan.calc(dan);
		System.out.println(result);
		
	}
}
