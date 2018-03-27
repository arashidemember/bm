package cn.com.chapter18JAVA_IO.period7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String>{
	static String readFile = "D:\\testFile\\MyDirList.java";
	//static String readFile = "MyDirList.java";
	
	static String writerFile = "D:\\testFile\\out.out";
	static String writerFile2 = "D:\\testFile\\out2.out";
	public TextFile(String fileName) {
		this(fileName,"\n");
	}

	public TextFile(String fileName, String splitter) {
		super(Arrays.asList(read(fileName).split(splitter)));
		if(get(0).equals("")) {
			remove(0);
		}
	}

	public static void main(String[] args) throws IOException  {
		String file = read(readFile);
		write(writerFile,file);
		TextFile text = new TextFile(writerFile);
		text.write(writerFile2);
		TreeSet<String> words = new TreeSet<String> (new TextFile(readFile,"\\W+"));
		System.out.println(words.headSet("a"));
	}
	
	public static void write(String fileName, String text) {
		try {
			PrintWriter out = new PrintWriter(new File(fileName));
			try {
				out.print(text);
			} finally  {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static void write(String writerFile2) {
		
	}
	
	public static String read(String string){
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(string)));
			try {
				String s;
				while (((s = in.readLine()) != null)) {
					sb.append(s);
					sb.append("\n");
				}
				
				}finally {
					in.close();
				}
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
		return sb.toString();
     }		
	
}


































