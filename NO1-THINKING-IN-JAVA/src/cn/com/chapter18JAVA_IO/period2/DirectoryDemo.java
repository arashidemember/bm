package cn.com.chapter18JAVA_IO.period2;

import java.io.File;

public class DirectoryDemo {
	public static void main(String[] args) {
		
		File file = new File("D:\\testFile");
		String start = new String("D:\\testFile");
		String regex = ".*\\.java";
		
		//PPrint.pprint(Directory.walk(file).dirs);
		//System.out.println("---------------------------------");
		
		for (File f:Directory.walk(start, regex)) {
			System.out.println(f);
		}
		
	}
}
