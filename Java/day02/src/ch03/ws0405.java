package ch03;

public class ws0405 {

	public static void main(String[] args) {

		int width = 5;
		int height = 7;

		double hypotenuse = Math.sqrt((width * width) + (height * height));

		System.out.println(Math.round(hypotenuse * 1000.0) / 1000.0);

	}

}
