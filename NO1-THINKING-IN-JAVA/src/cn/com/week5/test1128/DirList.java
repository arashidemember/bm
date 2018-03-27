package cn.com.week5.test1128;

import java.io.File;
import java.util.Arrays;

public class DirList {
	public static void main(String[] args) {
		File path = new File(".");
		//System.out.println(path.toString());
		String [] list;
		
		if (args.length == 0) {
			list = path.list();
		}else {
			list = path.list(new DirFilter(args[0]));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
//		for (String string : list) {
//			System.out.println(string);
//		}
	}	
		
}
