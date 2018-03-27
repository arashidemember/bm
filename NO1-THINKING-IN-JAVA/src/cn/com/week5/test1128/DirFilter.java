package cn.com.week5.test1128;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirFilter implements FilenameFilter {
	
	private Pattern pattern;
	
	public DirFilter(String regex) {
		pattern = pattern.compile(regex);
	}

	@Override
	public boolean accept(File dir, String name) {
		System.out.println("dir:"+dir.getAbsolutePath().toString());
		System.out.println("name:"+name);
		return pattern.matcher(name).matches();
	}
	/*public static void main(String[] args) {
		
       // Pattern pattern = Pattern.compile("*.java");
		DirFilter dfilter = new DirFilter(".*\\.java");
		File dir = new File(".");;
		String name = "DirFilter.java";
		boolean accept = dfilter.accept(dir, name);
		System.out.println(accept);
	}*/

}
