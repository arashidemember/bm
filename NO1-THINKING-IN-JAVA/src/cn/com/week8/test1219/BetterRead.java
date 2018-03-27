package cn.com.week8.test1219;
import java.util.Scanner;

import cn.com.week7.test1214.SimpleRead;



public class BetterRead{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(SimpleRead.input);
		System.out.println("what is your name?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println("how old are you? what is your favorite double?");
		System.out.println("(input:<age> <double>)");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		System.out.println(age);
		System.out.println(favorite);
		System.out.format("Hi %s.\n",name);
		System.out.format("In 5 years you will be %d.\n",age + 5);
		System.out.format("My favorite double is %f.",favorite/2);
	}
}
