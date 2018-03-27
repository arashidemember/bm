package cn.com.chapter18JAVA_IO.period8;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OSExcuteException extends ArrayList<String>{
	static String stringFile = "D:\\testFile\\MyDirList.java";
	static File  file = new File(stringFile);	
	
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(System.out,true);
		out.println("Hello,word");
	}
	
	
}


































