package ch05;

import java.util.Arrays;
import java.util.Random;

public class MinMax {

	public static void main(String[] args) {
		int ar[] = new int[5];
		Random rd = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rd.nextInt(9)+1;
			for (int j = 0; j < i; j++) {
				if(ar[i]==ar[j]) {
					i--;
				}
			} 
		}
		
		System.out.println(Arrays.toString(ar));
		
		int max = 0;
		int min = 999;
		for (int i = 0; i < ar.length; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
			if(min > ar[i]) {
				min = ar[i];
			}
		}
		System.out.printf("Max: %d, Min: %d",max,min);
	}

}








