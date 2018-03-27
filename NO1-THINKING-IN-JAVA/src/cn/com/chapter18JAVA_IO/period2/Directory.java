package cn.com.chapter18JAVA_IO.period2
;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class Directory{
	public static File[] local(File dir, final String regex) {
		return (dir).listFiles(new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);
			
			@Override
			public boolean accept(File dir, String name) {
				return false;
			}
		});
	}
	
	public static File[] local(String path, final String regex){
		return local(new File(path),regex);
	}
	
	public static class TreeInfo implements Iterable<File>{
		
		public List<File> files = new ArrayList<File>();
		public List<File> dirs = new ArrayList<File>();
		
		@Override
		public Iterator<File> iterator() {
			return files.iterator();
		}
		
		void addAll(TreeInfo other) {
			files.addAll(other.files);
			dirs.addAll(other.dirs);
		}
		public String toString() {
			return "dirs:" + PPrint.pformat(dirs)+"\n\nfiles:"+PPrint.pformat(files);
		}
		
	}
	
	private static TreeInfo recurseDirs(File startDir, String regex) {
		
		TreeInfo result = new TreeInfo();
		for (File item : startDir.listFiles()) {
			System.out.println("recurseDirs:开始");
			if(item.isDirectory()) {
				result.dirs.add(item);
				System.out.println("recurseDirs:添加目录");
				result.addAll(recurseDirs(item,regex));
			}else {
				if(item.getName().matches(regex)) {
					result.files.add(item);
					System.out.println("recurseDirs:添加文件");
				}
			}
			System.out.println("recurseDirs:结束");
		}
		
		return result;
	}

	public static TreeInfo walk(String start,String regex) {
		System.out.println("walk:开始");
		TreeInfo recurseDirs = recurseDirs(new File(start),regex);
		System.out.println("walk:结束");
		return recurseDirs;
		
	}
	
	public static TreeInfo walk(File start) {
		return recurseDirs(start,".*");
	}
	
	public static TreeInfo walk(String start) {
		return recurseDirs(new File(start),".*");
	}
	
}

































