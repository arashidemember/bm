package cn.com.week8.test1219;
import java.util.Scanner;
import java.util.regex.Pattern;

import cn.com.week7.test1214.SimpleRead;



public class ScannerDelimiter{
	public static void main(String[] args) {
		Scanner scanner = new Scanner("12,42,78,99,42");
		scanner.useDelimiter("\\s*,\\s*");
		while(scanner.hasNextInt())
			System.out.println(scanner.nextInt());
		System.out.println("------------");
		Pattern delimiter = scanner.delimiter();
		System.out.println(delimiter);
		System.out.println("------------");
	}
}
