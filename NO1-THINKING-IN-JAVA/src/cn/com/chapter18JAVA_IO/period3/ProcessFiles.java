package cn.com.chapter18JAVA_IO.period3;

import java.io.File;
import java.io.IOException;

import cn.com.chapter18JAVA_IO.period2.Directory;
import cn.com.chapter18JAVA_IO.period2.Directory.TreeInfo;

public class ProcessFiles {
	public interface Strategy{
		void process(File file);
	}
	private Strategy strategy;
	private String ext;
	public ProcessFiles(Strategy strategy,String string) {
		this.strategy = strategy;
		this.ext = ext;
	}
	public void start(String [] args) {
		System.out.println("start:开始");
		try {
			if (args.length == 0 ) {
				processDiretoryTree(new File("."));
			} else {
				for (String arg : args) {
					File fileArg = new File(arg);
					if (fileArg.isDirectory()) {
						processDiretoryTree(fileArg);
					}else {
						if (!arg.endsWith("."+ext)) {
							arg += "." + ext;
							strategy.process(new File(arg).getCanonicalFile());
						}
					}
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println("start:结束");
	}
	
	public  void processDiretoryTree(File root) throws IOException {
		System.out.println("processDiretoryTree：开始");
		TreeInfo walk = Directory.walk(root.getAbsolutePath(), ".*\\."+ext);
		for (File file : walk) {
			File canonicalFile = file.getCanonicalFile();
			strategy.process(canonicalFile);
		}
		System.out.println("processDiretoryTree：结束");
	}
	public static void main(String[] args) {
		String ext = "java";
		Strategy strategy = new Strategy() {
			@Override
			public void process(File file) {
				System.out.println(file.getAbsolutePath().toString());
				System.out.println("......");
			}
		};
		ProcessFiles pFile = new ProcessFiles(strategy,ext);
		pFile.start(args);
	}
	
	
	
	
	
}































