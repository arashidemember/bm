package cn.com.chapter18JAVA_IO.period6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoringAndRecoveringData {
	//static String readFile = "D:\\testFile\\MyDirList.java";
	static String writerFile = "D:\\testFile\\out.out";
	public static void main(String[] args)  {
		try {
			File file = new File(writerFile);
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream fbw = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream (fbw);
			
			dos.writeDouble(3.1415);
			dos.writeUTF("That was Pi");
			dos.writeDouble(1.141);
			dos.writeUTF("Square root of 2");
			dos.close();
			
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
