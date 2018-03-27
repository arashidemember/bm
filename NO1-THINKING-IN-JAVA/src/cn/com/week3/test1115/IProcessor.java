package cn.com.week3.test1115;

interface baseInterface{}

public interface IProcessor extends baseInterface{
	public String name();
	Object process(Object input);
	
	default void execute() {
		System.out.println("default execute");
	}
	
	default String returnString() {
		return "函数式编程，lamda表达式";
	}
}