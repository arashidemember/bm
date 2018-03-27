package cn.com.week8.test1221;

import java.util.ArrayList;
import java.util.List;

import cn.com.week4.test1122.Pet;

public class ForNameCreator extends PetCreator {
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames = {
			"cn.com.week8.test1221.Mutt",
			"cn.com.week8.test1221.Pug",
			"cn.com.week8.test1221.Manx",
			//"cn.com.week8.test1221.Cymric",
			"cn.com.week8.test1221.Rat",
			"cn.com.week8.test1221.Mouse",
			"cn.com.week8.test1221.Hamster"
	};
	@SuppressWarnings("unchecked")
	private static void loader() {
		for (String name : typeNames) {
			try {
				types.add((Class<? extends Pet>) Class.forName(name));
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		}
	}
	static {
		loader();
	}
	
	@Override
	public List<Class<? extends Pet>> types() {

		return types;
	}
	public static void main(String[] args) {
		ForNameCreator creator = new ForNameCreator();
	}
}
