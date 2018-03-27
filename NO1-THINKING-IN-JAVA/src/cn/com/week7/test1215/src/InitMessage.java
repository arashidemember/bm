package cn.com.week7.test1215.src;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class InitMessage{
	
	public  List<Message> init() throws Exception {
		
		List <Message> message = new ArrayList();
		Message header = new Message();
		Message body = new Message();
		Message tail = new Message();
		
		List<MyString> headerList = new ArrayList() ;
		List<MyString> bodyList = new ArrayList() ;
		List<MyString> tailList = new ArrayList() ;
		
		SAXReader sax = new SAXReader();
		
		Document domHeader = sax.read("src/cn/com/week7/test1215/config/header.xml");		
		Document domBody = sax.read("src/cn/com/week7/test1215/config/body.xml");
		Document domTail = sax.read("src/cn/com/week7/test1215/config/tail.xml");
		
		Element rootHeader = domHeader.getRootElement();
		Element rootBody = domBody.getRootElement();
		Element rootTail = domTail.getRootElement();
		
		List<Element> elementsHeader = rootHeader.elements();
		List<Element> elementsBody = rootBody.elements();
		List<Element> elementsTail = rootTail.elements();
		
		for (Element element : elementsHeader) {
			MyString temp = new MyString();
			temp.setId(element.attributeValue("id"));
			temp.setLength(element.attributeValue("length"));
			headerList.add(temp);
		}
		
		for (Element element : elementsBody) {
			MyString temp = new MyString();
			temp.setId(element.attributeValue("id"));
			temp.setLength(element.attributeValue("length"));
			bodyList.add(temp);
		}
		
		for (Element element : elementsTail) {
			MyString temp = new MyString();
			temp.setId(element.attributeValue("id"));
			temp.setLength(element.attributeValue("length"));
			tailList.add(temp);
		}
		
		header.setMyString(headerList);
		body.setMyString(bodyList);
		tail.setMyString(tailList);
		
		message.add(header);
		message.add(body);
		message.add(tail);
		
		System.out.println(header);
		System.out.println("-----------------------------");
		System.out.println(body);
		System.out.println("-----------------------------");
		System.out.println(tail);
		System.out.println("-----------------------------");
		
		return message;
		
	}
	
	
	
}
