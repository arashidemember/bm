package cn.com.week7.test1215.src;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test{
	
	public static void main(String[] args) throws Exception {
		
		/*InitMessage initMessage= new InitMessage();
		List<Message> message = initMessage.init();
		Message header = message.get(0);
		List<MyString> myStringHeader = header.getMyString();*/
		
		InitControls initControls = new InitControls();
		Controls controls = initControls.init();
		
		//System.out.println(controlsList);
		
		
		
		
		
		
		
		/*String source1 = "中国银行深圳分行";
		String source2 = "33333333333";
		
		String marshal1 = myStringHeader.get(0).marshal(source1);
		String marshal2 = myStringHeader.get(1).marshal(source2);
		
		Map map = new HashMap();
		map.put("bank", source1);
		map.put("account", source2);
		
		String marshal = header.marshal(map);
		
		System.out.println(marshal);*/
		
		
	}
	
	
	
}
