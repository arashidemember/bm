package cn.com.week3.test1115;

import java.util.Arrays;

class Splitter extends StringProcessor{
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}