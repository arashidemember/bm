package cn.com.chapter18JAVA_IO.period10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception {
		String path = "D:\\testFile\\data.txt";
		
		FileChannel fc = new FileOutputStream(path).getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
		
		fc = new RandomAccessFile(path,"rw" ).getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap("Some more".getBytes()));
		fc.close();
		
		fc = new FileInputStream(path).getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		Buffer flip = buff.flip();
		while(buff.hasRemaining()) {
			System.out.print((char)buff.get());
		}
		
	}
}
