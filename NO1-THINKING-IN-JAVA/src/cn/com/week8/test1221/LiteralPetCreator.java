package cn.com.week8.test1221;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import cn.com.week4.test1122.Pet;

public class LiteralPetCreator extends PetCreator {

	@SuppressWarnings("unchecked")
	public static final List<Class<? extends Pet>> allTypes= 
		Collections.unmodifiableList(Arrays.asList(Pet.class,Dog.class,Cat.class,Rodent.class));
	
	private static final List<Class <? extends Pet>> types = 
		allTypes.subList(allTypes.indexOf(Dog.class),
				allTypes.size());
		
		public List<Class<? extends Pet>> types() {
		return types;
	}
	public static void main(String[] args) {
		System.out.println(types);
	}
	
}























