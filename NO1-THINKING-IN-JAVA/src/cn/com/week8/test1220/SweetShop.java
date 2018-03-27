package cn.com.week8.test1220;


class Candy{
	static {
		System.out.println("Loading Candy");
	}
}
class Gum{
	static {System.out.println("Loading Gum");}
}

class Cookie{
	static {
		System.out.println("Loading Cookie");
	}
}



public class SweetShop {
	public static void main(String[] args) {
		
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		System.out.println();
		try {
			Class<?> forName = Class.forName("cn.com.week8.test1220.Cookie");
			System.out.println(forName);
		} catch (ClassNotFoundException e) {
			System.out.println("Coundn't find Cookie");
		}
		System.out.println();
		System.out.println("After Class.forName(\"Gum\")");
		System.out.println();
		new Cookie();
		System.out.println("After creating Cookie");
	}
	
}

