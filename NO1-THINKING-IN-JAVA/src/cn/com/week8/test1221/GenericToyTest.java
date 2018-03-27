package cn.com.week8.test1221;

import cn.com.week8.test1220.FancyToy;
class Toy{
	String toy = "toy";
	
}

class Fancy extends Toy{
	String fancy = "fancy";

	Fancy(){
		
	}
}
public class GenericToyTest {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException  {
		Class<Fancy> f = Fancy.class;
		Fancy fancy = f.newInstance();
		Class<? super Toy> up =  (Class<? super Toy>) f.getSuperclass();
		Object obj = up.newInstance();
	}
}























