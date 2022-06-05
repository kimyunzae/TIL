package day04;

import java.util.Random;
import java.util.Scanner;

public class Wss02 {

	public static void main(String[] args) {
		//1. 10~99까지의 숫자를 입력 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("Iuput num:");
		String snum = sc.next();
		
		//조건: 숫자여야 하며 범위안에 숫자여야 한다.
	    
		int num = Integer.parseInt(snum);
		
		//2. 2부터 입력 받은 숫짜 까지에서 난수를 발생 시킨다.
	    Random r = new Random();
	    int rnum = r.nextInt(num-1)+2;
		
		
		//3. 1부터 난수까지의 합을 구한다.
	    //단, 짝수의 값의 합과 평균을 구한다.
	    double sum = 0.0;
	    int count = 0;
	    for(int i=2; i<=rnum ;i += 2) {
    		sum += i;
    		count++;
	    }
	    
	    System.out.println(sum);
	    System.out.println(sum/count);
	    sc.close();
	}

}
