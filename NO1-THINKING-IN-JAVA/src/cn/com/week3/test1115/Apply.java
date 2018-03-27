package cn.com.week3.test1115;

public class Apply {
	public static void process(IProcessor p,Object s) {
		System.out.println("Using processor " + p.name());
		System.out.println(p.process(s));
	}
}
