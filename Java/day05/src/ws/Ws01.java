package ws;

import java.util.Arrays;
import java.util.Random;


public class Ws01 {

	public static void main(String[] args) {

		//double 형 배열 사이즈 5인 배열을 만들고
		double ar [] = new double [5];
		
		//0.0 ~ 10.0 사이의 랜돔한 값을 넣는다.
		Random r = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(11); 
		}
		
		//값을 출력 한다.
		System.out.println(Arrays.toString(ar));
	
	}

}