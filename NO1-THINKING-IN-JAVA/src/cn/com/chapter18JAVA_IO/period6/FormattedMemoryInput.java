package cn.com.chapter18JAVA_IO.period6;
import java.io.*;

import cn.com.chapter18JAVA_IO.period5.BufferedInputFile;
public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException {
		String filename = "D:\\testFile\\MyDirList.java";
		BufferedInputFile bf = new BufferedInputFile();
		String read = bf.read(filename);
		byte[] bytes = read.getBytes();
		ByteArrayInputStream bs = new ByteArrayInputStream(bytes);
		DataInputStream in = new DataInputStream(bs);
		while (in.available() != 0) {
			byte readByte = in.readByte();
			char c = (char)readByte;
			System.out.print(c);
		}
	}
}
