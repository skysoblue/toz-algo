package operator;

import java.util.Scanner;

public class ArithmeticMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Arithmetic arithmetic = new Arithmetic();
		
		while (true) {
			System.out.println("계속 : o , 종료 : x 입력");
			String goOrStop = scanner.next();
			if (goOrStop.equals("x")) {
				System.out.println("종료되었음");
				return;
			}
			System.out.println("A값입력 ");
			System.out.println("연산자입력");
			System.out.println("B값입력");
			System.out.println(arithmetic.calc(scanner.nextInt(),scanner.next(),scanner.nextInt()));
					/*
			System.out.println("A - B = " + (a - b));
			System.out.println("A * B = " + (a * b));
			System.out.println("A / B = " + (a / b));
			System.out.println("A % B = " + (a % b));
			*/
		}
	}

}
