package cn.com.week1.test1031;

public class StaticInit {
	static House h = new House();
	static Cupboard c = new Cupboard();

	public static void main(String[] args) {
		System.out.println("create new house in main");
		new Cupboard();
		System.out.println("create new house in main");
		new Cupboard();
		h.f2(1);
		c.f3(1);

	}
}

class Window {
	Window(int marker) {
		System.out.println("window(" + marker + ")");
	}

	void f1(int marker) {
		System.out.println("f1(" + marker + ")");

	}

}

class House {
	static Window w1 = new Window(1);
	static Window w2 = new Window(2);

	House() {
		System.out.println("house");
		w2.f1(1);
	}

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}


}

class Cupboard {
	static Window w4 = new Window(4);
	static Window w5 = new Window(5);
	Window w3 = new Window(3);

	Cupboard() {
		System.out.println("Cupboard()");
		w4.f1(2);
	}

	void f3(int marker) {
		System.out.println("f3(" + marker + ")");

	}

}
