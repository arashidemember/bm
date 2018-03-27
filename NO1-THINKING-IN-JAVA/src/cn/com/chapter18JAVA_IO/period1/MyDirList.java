package cn.com.chapter18JAVA_IO.period1;

import java.io.File;
import java.util.Arrays;

import cn.com.week5.test1128.DirFilter;

public class MyDirList{
	public static void main(String[] args) {
		
		args[0] = ".*\\.java";
		//File path = new File(".");
		File path = new File("C:\\workspace\\workspace_eclipse4.7\\TestProject\\src\\cn\\com\\chapter18\\day0109");
		String [] list;
		if (args.length == 0) {
			list = path.list();
			
		}else {
			list = path.list(new DirFilter(args[0]));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		System.out.println("---------------------------------------------");
		for (String string : list) {
			System.out.println(string);
		}
		//System.out.println(path.getAbsolutePath().toString());
	}
}
