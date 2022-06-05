package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
		//int형 배열 사이즈 10인 배열을 만들고
		int ar[] = new int[10];
		
		//1~99까지의 랜덤한 숫자를 입력 한다.
		Random r = new Random(100);
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(100);
			if(i % 2 == 1) {
				sum += ar[i];
				count++;
			}
		}
		
		//배열의 값이 홀수의 값들만의 합과 평균을 구한다.
		System.out.println(Arrays.toString(ar));
		System.out.println("Total: " + sum);
		System.out.println("Avg: " + sum/count);
	}

}