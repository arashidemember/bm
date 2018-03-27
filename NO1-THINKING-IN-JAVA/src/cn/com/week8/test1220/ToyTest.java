package cn.com.week8.test1220;

/*interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
	Toy(){
		
	}
	Toy(int i){
		
	}
}

*/


public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Class name:" + cc.getName()
						 + "is interface?[" + cc.isInterface() + "]");
		System.out.println("Simple name:"+cc.getSimpleName());
		System.out.println("Cannoical name:"+ cc.getCanonicalName());
		
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("cn.com.week8.test1220.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face : c.getInterfaces()) {
			System.out.println(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException  e) {
			System.out.println("can not instantiate");
			System.exit(1);
		}catch (IllegalAccessException e) {
			System.out.println("can not access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
	
}

