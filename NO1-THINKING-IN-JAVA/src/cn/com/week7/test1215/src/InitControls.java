package cn.com.week7.test1215.src;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class InitControls{
	
	public  Controls init() throws Exception {
		
		List <Control> controlList = new ArrayList();
		
		Controls controls = new Controls();
		
		SAXReader sax = new SAXReader();
		
		Document domControls = sax.read("src/cn/com/week7/test1215/config/outwardReturn.xml");		
		Element rootControls = domControls.getRootElement();
		List<Element> elementsHeader = rootControls.elements();
		
		List<MyString> headerList = new ArrayList() ;
		for (Element element : elementsHeader) {
			Control control = new Control();
			control.setId(element.attributeValue("id"));
			control.setRef(element.attributeValue("ref"));
			controlList.add(control);
		}
		
		controls.setControls(controlList);
		
		System.out.println(controls);
		
		return controls;
		
	}
	
	
	
}
