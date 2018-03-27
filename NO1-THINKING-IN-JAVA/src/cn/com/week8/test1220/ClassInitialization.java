package cn.com.week8.test1220;

import java.util.Random;

class Initable{
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Initable");
	}
}

class Initable2{
	static int staticNonFinal = 147;
	static {
		System.out.println("Initializing Initable2");
	}
}

class Initable3{
	static int staticNonFinal = 74;
	static {
		System.out.println("Initializing Initable3");
	}
}

public class ClassInitialization {
	public static Random rand = new Random(47);
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class initable = Initable.class;
		System.out.println();
		System.out.println("1111111111111111start");
		System.out.println(Initable.staticFinal);
		System.out.println("11111111111111111111");
		System.out.println(Initable.staticFinal2);
		System.out.println("1111111111111111end");
		System.out.println();
		
		System.out.println("222222222222start");
		System.out.println(Initable2.staticNonFinal);
		System.out.println("222222222222end");
		System.out.println();
		
		Class initable3 = Class.forName("cn.com.week8.test1220.Initable3");//执行了static{}
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	
	
	
	}
}























