package cn.com.week8.test1222;

public interface Factory<T> {

	
	public Factory<? extends T> create(); 

}
