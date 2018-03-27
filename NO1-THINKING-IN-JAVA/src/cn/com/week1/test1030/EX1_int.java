package cn.com.week1.test1030;

 class  SuperClass{
 
	 static {
		 System.out.println("superclass");
	 }
	 public static final String value = "hello";
}
 class SubClass extends SuperClass{
	 static {
		 System.out.println("subclass");
	 }
}
 public class EX1_int {
	 public static void main(String[] args) {
		System.out.println(SubClass.value);
	}
	
}

