package cn.com.chapter10.day0103;
class Callee1 implements Incrementable{
	private int i = 0 ;
	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}
	
}

class MyIncrement{
	public void increment() {
		System.out.println("MyIncrement.increment");
	}
	static void f(MyIncrement mi ) {
		System.out.println("MyIncrement.f  start");
		mi.increment();
		System.out.println("MyIncrement.f  end");
	}
}

class Callee2 extends MyIncrement{
	private int i = 0;
	public void increment() {
		System.out.println("callee2 increment start");
		super.increment();
		i++;
		System.out.println("callee2: i = "+ i);
		System.out.println("callee2 increment end");
	}
	private class Closure implements Incrementable{
		
		@Override
		public void increment() {
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller{
	private Incrementable callbackReference;
	Caller(Incrementable cbh){
		callbackReference = cbh;
	}
	void go() {
		callbackReference.increment();
	}
}

public class Callbacks{
	public static void main(String[] args) {
		//Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		c2.increment();
		Incrementable callbackReference = c2.getCallbackReference();
		
		//MyIncrement.f(c2);
		//Caller caller1 = new Caller(c1);
		//Caller caller2 = new Caller(c2.getCallbackReference());
		//caller1.go();
		//caller2.go();
		//caller1.go();
		//caller2.go();
		
	}
}

















