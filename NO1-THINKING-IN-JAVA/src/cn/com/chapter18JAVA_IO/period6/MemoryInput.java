package cn.com.chapter18JAVA_IO.period6;

import java.io.IOException;
import java.io.StringReader;

import cn.com.chapter18JAVA_IO.period5.BufferedInputFile;

public class MemoryInput {
	
	public static void main(String[] args) throws IOException {
		
		String filename = "D:\\testFile\\MyDirList.java";
		BufferedInputFile bf = new BufferedInputFile();
		String read = bf.read(filename);
		StringReader sr = new StringReader(read);
		int c;
		while((c = sr.read()) != -1){
			System.out.print((char)c);
		}
	}
	
	
}































