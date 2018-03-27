package cn.com.chapter18JAVA_IO.period6;
import java.io.*;

public class UsingRandomAccessFile {
	//static String readFile = "D:\\testFile\\MyDirList.java";
	static String writerFile = "D:\\testFile\\out.out";
	public static void main(String[] args) throws IOException  {
		RandomAccessFile rf = new RandomAccessFile(writerFile, "rw");
		for (int i = 0; i < 5; i++) {
			rf.writeDouble(i*1.414);
		}
		rf.writeUTF("The end of the file");
		rf.close();
		display();
		System.out.println("-------------------------------------------");
		rf = new RandomAccessFile(writerFile, "rw");
		rf.seek(4*5);
		rf.writeDouble(47.0001);
		rf.close();
		display();
	}
	
	static void display() throws IOException {
		RandomAccessFile rf = new RandomAccessFile(writerFile, "r");
		for (int i = 0; i < 5; i++) {
			System.out.println("Value" + i + ":" +"  "+ rf.readDouble());
		}
		System.out.println(rf.readUTF());
		rf.close();
		
	}
	
}
