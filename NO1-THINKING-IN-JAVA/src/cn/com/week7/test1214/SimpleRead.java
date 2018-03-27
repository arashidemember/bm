package cn.com.week7.test1214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class SimpleRead{
	
	public static StringReader sr = new StringReader("Sir Robin \n22 1.61803");
	public static BufferedReader input = new BufferedReader(sr);
	
	public static void main(String[] args) {
		try {
			System.out.println("what is your name?");
			String name = input.readLine();
			System.out.println(name);
			System.out.println("how old are you? what is your favorite double?");
			System.out.println("(input:<age> <double>)");
			String numbers = input.readLine();
			System.out.println(numbers);
			System.out.println("---------------");
			String [] numArray = numbers.split(" ");
			//
			int age = Integer.parseInt(numArray[0]);
			double favorite = Double.parseDouble(numArray[1]);
			System.out.format("Hi %s.\n",name);
			System.out.format("In 5 years you will be %d.\n",age + 5);
			System.out.format("My favorite double is %f.",favorite/2);
		}catch(IOException e) {
			System.err.println("I/o EXCEPTION");
		}
	}
}
