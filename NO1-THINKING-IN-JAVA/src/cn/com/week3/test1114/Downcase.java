package cn.com.week3.test1114;

class Downcase extends Processor {
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}