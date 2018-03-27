package cn.com.week5.test1130;

import java.util.Random;

public class MyString {
	public static Random rand = new Random(5);
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			sb.append(rand.nextInt(10));
			sb.append(",");
		}
		
		return sb.toString();
	}
	public String toString1() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			sb.append(rand.nextInt(10));
			sb.append(",");
		}
		sb.delete(4, sb.length());
		return sb.toString();
	}
	public static void main(String[] args) {
		MyString mys = new MyString();
		System.out.println(mys);
		
		System.out.println(mys.toString1());
	
	}
	

}
