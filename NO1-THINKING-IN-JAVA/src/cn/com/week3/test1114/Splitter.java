package cn.com.week3.test1114;

import java.util.Arrays;

class Splitter extends Processor{
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}