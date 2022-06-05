package p654;

public class Box<T> {
	T obj;	//generic: 옵젝을 알파벳 하나로 대체

	public Box() {
	}

	public void setBox(T c) {
		obj = c;
	}

	public T getBox() {
		return obj;
	}

}
