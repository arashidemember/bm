package cn.com.week3.test1117;

import java.io.DataInputStream;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {
	private static Random rand = new Random(47);
	private static final char[] capitals = "AAAAAAAAAAA".toCharArray();
	private static final char[] lowers = "aaaaaaaaaaaaaaaaa".toCharArray();
	private static final char[] vowels = "ssssssss".toCharArray();
	private int count;
	public RandomWords(int count) {
		this.count = count;
	}
	public int read(CharBuffer cb) {
		if (count-- == 0) {
			return -1;
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append("\n");
		return 1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(new RandomWords(3));
		while (s.hasNext()) {
			System.out.println(s.next());
			System.out.println("=====");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
