package p654;

public class Box<T> {
	T obj;	//generic: ������ ���ĺ� �ϳ��� ��ü

	public Box() {
	}

	public void setBox(T c) {
		obj = c;
	}

	public T getBox() {
		return obj;
	}

}
