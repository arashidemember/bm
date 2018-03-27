package cn.com.week7.test1215.src;



public class MyString{
	
	String id;
	String length;
	public MyString(String id, String length) {
		super();
		this.id = id;
		this.length = length;
	}
	public MyString() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "MyString (id=" + id + ", length=" + length + ")";
	}
	
	public String marshal(String source) {
		int iLength = Integer.parseInt(length);
		if (source.length() > iLength) {
			source = source.substring(0, iLength);
		}else {
			int i = iLength - source.length();
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < i; j++) {
				sb.append(" ");
			}
			source = source + sb.toString();
		}
		return source;
	}
	
	
}
