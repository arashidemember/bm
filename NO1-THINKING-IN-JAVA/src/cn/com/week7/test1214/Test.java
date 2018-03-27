package cn.com.week7.test1214;

public class Test implements Runnable{
	public static void add3(Integer i) {
		int val = i.intValue();
		val += 3;
		i = new Integer(val);
	}
	
	public void run(int limit){ 
		for(int x=0;x<limit;x++) 
			System.out.println(x); 
		}

	public static void main(String[] args) {
		/*Test t = new Test();
		Object o = new Object();

		System.out.println(t instanceof Object);*/
		/*Integer i=new Integer(0); 
		add3(i); 
		System.out.println(i.intValue()); */
		Thread t= new Thread(new Test());
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
	
}
