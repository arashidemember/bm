package cn.com.week5.test1127;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Fruit implements Comparable<Fruit>{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public int compareTo(Fruit o) {
		return 0;
	}

}
public class MyList{
	
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		Fruit myFruit0 = new Fruit("apple0");
		Fruit myFruit1 = new Fruit("apple1");
		Fruit myFruit2 = new Fruit("apple2");
		Fruit myFruit3 = new Fruit("apple3");
		Fruit myFruit4 = new Fruit("apple4");
		Fruit myFruit5 = new Fruit("apple5");
		Fruit myFruit6 = new Fruit("apple6");
		Fruit myFruit7 = new Fruit("apple7");
		Fruit myFruit8 = new Fruit("apple8");
		list.add(myFruit0);
		list.add(myFruit1);
		list.add(myFruit2);
		list.add(myFruit3);
		list.add(myFruit4);
		list.add(myFruit5);
		list.add(myFruit6);
		list.add(myFruit7);
		list.add(myFruit8);
		/*for (Fruit f : list) {
			System.out.println(f);
		}
		System.out.println("------------------");*/
		List<Fruit> subList = list.subList(3, 5);
		Fruit e = new Fruit("pear");
		subList.add(e);
		/*for (Fruit f : subList) {
			System.out.println(f);
		}*/
		//System.out.println("********************");
		Collections.sort(list);
		
		
		for (Fruit f : list) {
			System.out.println(f);
		}
		boolean containsAll = list.containsAll(subList);
		//System.out.println(containsAll);
		
		
	
		
		
	}
}
