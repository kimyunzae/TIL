package p422;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number:");
		String num = sc.next();
		int n = 0;
		int result = 0;
		try {
			n = Integer.parseInt(num);
			result = 100 / n;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("분모가 0 입니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		} finally {
			sc.close();
			System.out.println("end");
		}
		
	}

}
