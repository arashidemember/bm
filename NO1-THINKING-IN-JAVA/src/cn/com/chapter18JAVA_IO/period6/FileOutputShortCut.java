package cn.com.chapter18JAVA_IO.period6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import cn.com.chapter18JAVA_IO.period5.BufferedInputFile;

public class FileOutputShortCut {
	static String readFile = "D:\\testFile\\MyDirList.java";
	static String writerFile = "D:\\testFile\\writer.out";
	

	public static void main(String[] args) {
		try {
			BufferedInputFile bif = new BufferedInputFile();
			String in = bif.read(readFile);		
			StringReader sr = new StringReader(in);
			BufferedReader br = new BufferedReader(sr);
			
			//FileWriter fw = new FileWriter(writerFile);
			//BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter  out = new PrintWriter(writerFile);
			
			int lineCount = 1;
			String s;
			while((s = br.readLine())!= null) {
				out.println(lineCount++ + ":" + s);
			}
			out.close();
			System.out.println(BufferedInputFile.read(writerFile));
		
		
		
		
		
		
		
		
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}