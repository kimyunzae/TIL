package ws;
import java.util.Arrays;

public class Ws04 {

	public static void main(String[] args) {
	
		//이차원 배열에 3명의 학생들의 점수가 있다.
		int ar[][] = new int [3][];
		
		ar[0] = new int []{100,99,80,70};
		ar[1] = new int []{98,91,83,72};
		ar[2] = new int []{89,96,82,75}; 
		
		//학생 별 점수를 출력 한다.
		System.out.println("s1: " + Arrays.toString(ar[0]));
		System.out.println("s2: " + Arrays.toString(ar[1]));
		System.out.println("s3: " + Arrays.toString(ar[2]));
		
		//전체 점수의 합과 평균을 구하시오.
		double sum = 0.0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				sum += ar[i][j];
			}
		}
		System.out.println("Total score: " + sum);
		System.out.println("avg: " + Math.round(sum/(ar.length * ar[0].length)*100.0)/100.0);
		
		
		//학생별 평균을 새로운 배열을 만들어 넣고 출력 하시오
		int s1[] = new int [] {100,99,80,70};
		int s2[] = new int [] {98,91,83,72};
		int s3[] = new int [] {89,96,82,75}; 
		
		int s1Sum = 0;
		for (int i = 0; i < s1.length; i++) {
				s1Sum += s1[i];
		}
		System.out.println("s1 avg: " + s1Sum/s1.length);
		
		
		int s2Sum = 0;
		for (int i = 0; i < s2.length; i++) {
				s2Sum += s2[i];
		}
		System.out.println("s2 avg: " + s2Sum/s2.length);
		
		
		int s3Sum = 0;
		for (int i = 0; i < s3.length; i++) {
				s3Sum += s3[i];
		}
		System.out.println("s3 avg: " + s3Sum/s3.length);
	}

}