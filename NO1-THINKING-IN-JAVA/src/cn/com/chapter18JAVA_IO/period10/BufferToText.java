package cn.com.chapter18JAVA_IO.period10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception {
		String path = "D:\\testFile\\data2.txt";
		
		FileChannel fc = new FileOutputStream(path).getChannel();
		fc.write(ByteBuffer.wrap("Some  sdfsadf  text".getBytes()));
		fc.close();
		
		fc = new FileInputStream(path).getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		
		System.out.println(buff.asCharBuffer());
		
		buff.rewind();
		String encoding = System.getProperty("file.encoding");
		System.out.println("Decoded using " + encoding + ":" + Charset.forName(encoding).decode(buff));
		
		fc = new FileOutputStream(path).getChannel();
		fc.write(ByteBuffer.wrap("new somen dslfjsd".getBytes("UTF-16BE")));
		fc.close();
		fc = new FileInputStream(path).getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		
		
	}
}
