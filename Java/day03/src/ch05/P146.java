package ch05;

public class P146 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if(a > b) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		

		String s1 = "abc";
		String s2 = "abc";
		
		if(s1 == s2) {
			System.out.println("Equals Refernce ..");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Equals String ..");
		}
		
	}

}



