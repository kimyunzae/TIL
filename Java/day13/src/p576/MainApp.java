package p576;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Start");

		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
			try {
				Thread.sleep(1000); // 매인 스레드가 실행될때 1초 후에 실행해라
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		System.out.println("End");
	}

}
