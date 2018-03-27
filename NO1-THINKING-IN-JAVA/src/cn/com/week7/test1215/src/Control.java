package cn.com.week7.test1215.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Control {
	String id;
	String ref;
	
	Message message;
	
	public Control(String id, String ref) {
		super();
		this.id = id;
		this.ref = ref;
	}
	public Control() {
		super();
		
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) throws DocumentException {
		this.ref = ref;
		message = initMessage(ref);
	}
	
	private Message initMessage(String ref) throws DocumentException {
		SAXReader sax = new SAXReader();
		Document domControls = sax.read(ref);

		Element rootControls = domControls.getRootElement();
		List<Element> elementsHeader = rootControls.elements();
		
		List<MyString> headerList = new ArrayList() ;
		for (Element element : elementsHeader) {
			MyString temp = new MyString();
			temp.setId(element.attributeValue("id"));
			temp.setLength(element.attributeValue("length"));
			headerList.add(temp);
		}
		return message;
	}
	@Override
	public String toString() {
		return "\n(id=" + id + ", ref=" + ref + ")";
	}
	public String marshal(Map source) {
		return message.marshal(source);
	}
	
	

}
