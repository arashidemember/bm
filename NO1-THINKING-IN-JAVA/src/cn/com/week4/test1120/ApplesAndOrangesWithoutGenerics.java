package cn.com.week4.test1120;

import java.util.ArrayList;

class Apple {
		private static long counter;
		private final long  id = counter++;
		public long id() {
			return id;
		}
	}
	class Orange{
		
	}


	public class ApplesAndOrangesWithoutGenerics {
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			ArrayList<Apple> apples = new ArrayList();
			for (int i = 0; i < 3; i++) {
				apples.add(new Apple());
				System.out.println(apples.get(i).id());
				
			}
			for (int i = 0; i < 3; i++) {
				apples.add(new Apple());
				System.out.println(apples.get(i).id());
				
			}
			
			for (int i = 0; i < apples.size(); i++) {
				((Apple)apples.get(i)).id();
			}
		}
	}


















