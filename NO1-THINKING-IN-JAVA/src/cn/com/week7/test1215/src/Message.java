package cn.com.week7.test1215.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author dingruoran
 *
 */
public class Message{
	
	List<MyString> myString = new ArrayList<>();


	public Message() {
	}

	@Override
	public String toString() {
		return "Message " + myString;
	}

	public List<MyString> getMyString() {
		return myString;
	}

	public void setMyString(List<MyString> myString) {
		this.myString = myString;
	}
	
	public String marshal(Map source) {
		StringBuilder sb = new StringBuilder();
		for (MyString myString2 : myString) {
			String a = myString2.marshal((String) source.get(myString2.getId()));
			sb.append(a);
		}
		return sb.toString();
	}
	
	
}
