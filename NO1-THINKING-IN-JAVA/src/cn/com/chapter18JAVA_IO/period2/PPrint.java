package cn.com.chapter18JAVA_IO.period2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/** 
* @Description: 灵活打印工具类
* @author DingRuoRan
* @date 2018年1月9日 下午1:57:14 
*  
*/
public class PPrint {
	public static String pformat(Collection<?> c) {
		if (c.size() == 0) {
			return "[]";
		}
		StringBuilder result = new StringBuilder("[");
		for (Object elem : c) {
			if (c.size() != 1) {
				result.append("\n ");
			}
			result.append(elem);
		}
		if (c.size() != 1) {
			result.append("\n");
		}
		result.append("]");
		return result.toString();
	}
	
	public static void pprint(Collection<?> c) {
		System.out.println(pformat(c));
	}
	public static void pprint(Object[] c) {
		System.out.println(pformat(Arrays.asList(c)));
	}
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("------------");
		System.out.println(list.toString());
		System.out.println("------------");
		PPrint p = new PPrint();
		String pformat = p.pformat(list);
		System.out.println(pformat);
		//p.pprint(list);
		
	}
	
}



















