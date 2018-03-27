package cn.com.chapter18JAVA_IO.period7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {
	
	public static byte[] read(File bFile) throws IOException{
		BufferedInputStream bf = new BufferedInputStream(new FileInputStream(bFile));
		try {
			int available = bf.available();
			System.out.println("avalable = "+available);
			byte[] data = new byte[available];
			System.out.println("data-------------");
			for (byte b : data) {
				System.out.println(b);
			}
			System.out.println("data-------------");
			int read = bf.read();
			for (byte b : data) {
				System.out.println(b);
			}
			System.out.println("data-------------");
			return data;
		} finally{
			bf.close();
		}
	}
	
	public static byte[] read(String bFile) throws IOException{
		
		
		return read(new File(bFile));
	}
	
	public static void main(String[] args) throws IOException {
		String sFile = "D:\\testFile\\MyDirList.java";
		File bFile = new File(sFile);
		byte[] read = read(bFile);
		System.out.println(read.toString());
	}
	
}



































