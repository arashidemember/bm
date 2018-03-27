package cn.com.chapter18JAVA_IO.period10;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class UsingBuffers {
	
	public static void main(String[] args) {
		char[] data = "UsingBuffers".toCharArray();
		ByteBuffer bb = ByteBuffer.allocate(data.length);
	}
	
	
	
	
	public static void symmetricScramble(CharBuffer buffer) {
		Buffer mark = buffer.mark();
		char c1 = buffer.get();
	}
}
