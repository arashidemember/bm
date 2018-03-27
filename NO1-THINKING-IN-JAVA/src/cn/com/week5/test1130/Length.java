package cn.com.week5.test1130;

public class Length {
	
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		s.append("123");
		System.out.println(s);
		System.out.println(s.length());
		s.delete(0, 2);
		System.out.println(s);
	
	}
	

}
