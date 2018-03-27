package cn.com.week1.test1103;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

class Shape {
	/*Shape(){
		
	}*/
	Shape(int i){
		System.out.println("Shape constructor");
	}
	void dispose() {
		System.out.println("Shape dispose");
	}
}
class Circle extends Shape{

	Circle(int i) {
		super(i);
		System.out.println("Circle constructor");
	}
	void dispose() {
		System.out.println("Erasing Circle");
		super.dispose();
	}
	
}

public class CADSystem extends Shape{
	private Circle c;
	public CADSystem(int i) {
		super(i);
		c = new Circle(i);
	}
	public void dispose() {
		c.dispose();
		super.dispose();
	}
	public static void main(String[] args) throws Exception {
		CADSystem x = new CADSystem(47);
		try {
			
		} catch (Exception e) {
			
		}finally {
			x.dispose();
		}
		
		
	}
}














