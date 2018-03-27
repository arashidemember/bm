package cn.com.week2.test1107;

public class FinalField {
	public static void main(String[] args) {
		System.out.println(Init.init_value1);
	}
}
class Init{
	static {
		System.out.println("inited!");
	}
	public static int init_value1 = 1;
	public static final int init_value2 = 1;
	public final int init_value3 = 1;
}