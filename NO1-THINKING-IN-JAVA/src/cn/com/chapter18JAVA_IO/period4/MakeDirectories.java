package cn.com.chapter18JAVA_IO.period4;

import java.io.File;

public class MakeDirectories {
	
	private static void fileData(File f) {
		System.out.println("Absolute path:" + f.getAbsolutePath() + "\n Can read:" +f.canRead());
	}
	
	public static void main(String[] args) {
		File file = new File("D:\\testFile");
		String absolutePath = file.getAbsolutePath();
		boolean canWrite = file.canWrite();
		boolean canRead = file.canRead();
		String name = file.getName();
		String parent = file.getParent();
		String path = file.getPath();
		long length = file.length();
		long lastModified = file.lastModified();
		boolean file2 = file.isFile();
		boolean directory = file.isDirectory();
		boolean exists = file.exists();
		
		System.out.println(exists);
	}
	
}
