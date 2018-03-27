package cn.com.week2.test1106;

interface Alogrithm{
	int caculate();
}
class BaseAlogrithm implements Alogrithm{
	@Override
	public int caculate() {
		return 1;
	}
}
class BaseAlogrithm2 implements Alogrithm{
	@Override
	public int caculate() {
		return 2;
	}
}


public class Lunch {

	Alogrithm alogrithm;
	
	public void decide() {
		System.out.println(alogrithm.caculate());
	}
	
	public Lunch() {
		this.alogrithm = new Alogrithm() {
			@Override
			public int caculate() {
				return 3;
			}
		};
	}
	public Lunch(Alogrithm alogrithm) {
		this.alogrithm = alogrithm;
	}
	public void setAlogrithm(Alogrithm alogrithm) {
		this.alogrithm = alogrithm;
	}
	
	public static void main(String[] args) {
		Lunch a = new Lunch(new BaseAlogrithm());
		a.decide();
		a.setAlogrithm(new BaseAlogrithm2());
		a.decide();
		Lunch b = new Lunch();
		b.decide();
		
		System.out.println(b.alogrithm.getClass());
	}
}
