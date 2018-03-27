package cn.com.week1.test1101;

public class ArrayNew {
	static void f(String... c) {
		System.out.println(c.getClass());
		System.out.println("length of c:"+c.length);
	}
	public static void main(String[] args) {
		/*f("a");
		System.out.println("int[]:"+ new int[0].getClass());*/
		
		Spiciness spiciness = Spiciness.MEDIUM;
		for (Spiciness s : Spiciness.values()) {
			System.out.println(s+".ordinal" + s.ordinal());
		}
		//System.out.println(spiciness);
		
	}
	
	
}
