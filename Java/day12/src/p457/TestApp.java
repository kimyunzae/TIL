package p457;

public class TestApp {

	public static void main(String[] args) {
		Object obj1 = new String("abc");
		Object obj2 = new CustomerVO("id01", "pwd01", "Lee");
		
		CustomerVO c = (CustomerVO)obj2;	//타입캐스팅
		System.out.println(c.getName());	
		
		
		Object obj3 = 10;
		Object obj4 = new Integer(10);
	}

}
